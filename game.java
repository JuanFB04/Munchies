import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla de juego principal
 */
public class game extends World
{
    int cant_ojos=0;
    int cant_cerebros=0;
    int cant_bichos=0;
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    private int start = 0;
    /**
     * Constructor
     */
    public game(){    
        super(500, 500, 1); 
        Pizza pizza1=new Pizza();
        addObject(pizza1,250,420);
        addObject(timeCount, getWidth()/2, getHeight()/13);
        timeCount.setValue(60);
        Greenfoot.setSpeed(50);
       
        }
    public void act(){
        if(Greenfoot.isKeyDown("q")){
            agregar_ojo();
            Greenfoot.delay(15);
        }
        if(Greenfoot.isKeyDown("w")){
            agregar_cerebro();
            Greenfoot.delay(15);
        }
        if(Greenfoot.isKeyDown("e")){
            agregar_bicho();
            Greenfoot.delay(15);
        }
        
        if (start == 1)
        {
            if (tim.millisElapsed() >= 1000)
            {
                timeCount.add(-1);
                tim.mark();
            }
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            start = 1;
            tim.mark();
        }
    }
    
    public int getRandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    /**
     * Agregar toppings
     */
    public void agregar_ojo(){
        int randx=getRandomNumber(180,320);
        int randy=getRandomNumber(360,480);
        Ojo_topping ojo1 = new Ojo_topping();
        addObject(ojo1,randx,randy);
        cant_ojos ++;
    }
    public void agregar_cerebro(){
        int randx=getRandomNumber(180,320);
        int randy=getRandomNumber(360,480);
        Cerebro_topping cerebro1 = new Cerebro_topping();
        addObject(cerebro1,randx,randy);
    }
    public void agregar_bicho(){
        int randx=getRandomNumber(180,320);
        int randy=getRandomNumber(360,480);
        Bicho_topping bicho1 = new Bicho_topping();
        addObject(bicho1,randx,randy);
    }
    
}
