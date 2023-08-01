import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla de juego principal
 */
public class game extends World
{
    int cant_ojos=0, orden_ojos=0;
    int cant_cerebros=0, orden_cerebros=0;
    int cant_bichos=0,orden_bichos=0;
    String orden_color;
    int score=0;
    int lives = 3;
    Pizza pizza1=new Pizza("neutral");
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    Counter difficultyTimer = new Counter();
    Boolean run=false;
    private boolean isgamover = false;
    GreenfootSound backgroundMusic = new GreenfootSound("sounds/backgroundMusic.mp3");

    /**
     * Constructor
     */
    public game(){    
        super(500, 500, 1); 
        addObject(pizza1,250,420);
        addObject(timeCount, getWidth()/2, getHeight()/13);
        timeCount.setValue(60);
        Greenfoot.setSpeed(45);
        addObject(new vidas(),410, 30);
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(40); 
        }
        
    public void act(){
        showText(("Punteo:"),50,30);
        showText(Integer.toString(score),120,30);
        
        showText(("x "), 440,30);
        showText(Integer.toString(lives),450,30);
        
        if(Greenfoot.isKeyDown("q")){
            agregar_ojo();
            Greenfoot.delay(5);
        }
        if(Greenfoot.isKeyDown("w")){
            agregar_cerebro();
            Greenfoot.delay(5);
        }
        if(Greenfoot.isKeyDown("e")){
            agregar_bicho();
            Greenfoot.delay(5);
        }
        if(Greenfoot.isKeyDown("k")){
            limpiar_tablero();
            generar_orden();
            Fail fail = new Fail();
            addObject(fail,250,250);
            Greenfoot.delay(5);
            removeObjects(getObjects(Fail.class));
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("enter")){
            if(comprobar_orden()==true){
            score+=100;
            timeCount.setValue(timeCount.getValue()+5);
            Nice nice = new Nice();
            addObject(nice,250,250);
            Greenfoot.delay(5);
            removeObjects(getObjects(Nice.class));
            limpiar_tablero();
            generar_orden();
            }
            else{

            timeCount.setValue(timeCount.getValue()-5);
            lives--;
            if (lives <= 0){
                gamover.prepare(score);
                Greenfoot.setWorld(new gamover());
                backgroundMusic.stop();
            }
            
            else{
            limpiar_tablero();
            generar_orden();
            Fail fail = new Fail();
            addObject(fail,250,250);
            Greenfoot.delay(5);
            removeObjects(getObjects(Fail.class));
            
        }
            
            }
            
            Greenfoot.delay(10);
        
        }
        /**
         * Inicio del juego al presionar space y fin al llegar el timer a 0
         */
          if (Greenfoot.isKeyDown("space") && !run){
            run=true;
            generar_orden();
            Greenfoot.delay(10);
            timeCount.setValue(60);
            tim.mark();
        }
        
        if (run==true){
            if (tim.millisElapsed() >= 1000){
                timeCount.add(-1);
                difficultyTimer.add(1);
                tim.mark();
            }
        }
        
        if (timeCount.getValue() <= 0){
            gamover.prepare(score);
            Greenfoot.setWorld(new gamover());
            backgroundMusic.stop();
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
        cant_cerebros ++;
    }
    public void agregar_bicho(){
        int randx=getRandomNumber(180,320);
        int randy=getRandomNumber(360,480);
        Bicho_topping bicho1 = new Bicho_topping();
        addObject(bicho1,randx,randy);
        cant_bichos ++;
    }
    
    /**
     * Generar orden a cumplir
     */
     public void generar_orden(){
        if(difficultyTimer.getValue()>=30){
        orden_ojos=getRandomNumber(3,6);
        orden_cerebros=getRandomNumber(3,6);
        orden_bichos=getRandomNumber(3,6);   
        }
        else{
        orden_ojos=getRandomNumber(1,6);
        orden_cerebros=getRandomNumber(1,6);
        orden_bichos=getRandomNumber(1,6);
        }
        int num_color=getRandomNumber(1,3);
        showText(Integer.toString(orden_ojos),400,95);
        showText(Integer.toString(orden_cerebros),400,125);
        showText(Integer.toString(orden_bichos),400,155);
        Salsa salsa1 = new Salsa();
        addObject(salsa1,420,190);
        if(num_color==1){
            orden_color="morado";
            salsa1.Cambio_salsa("morado");
        }
        if(num_color==2){
            orden_color="azul";
            salsa1.Cambio_salsa("azul");
        }
        if(num_color==3){
            orden_color="verde";
            salsa1.Cambio_salsa("verde");
        }
    }
    /**
     * Quita todos los objetos y reinicia los counters de objetos
     */
    public void limpiar_tablero(){
        cant_ojos=0;
        cant_cerebros=0;
        cant_bichos=0;
        pizza1.quitar_Salsa();
        removeObjects(getObjects(Ojo_topping.class));
        removeObjects(getObjects(Cerebro_topping.class));
        removeObjects(getObjects(Bicho_topping.class));
        removeObjects(getObjects(Salsa.class));
    }
    /**
     * Comprueba si la orden coincide con lo solicitado
     */
    public boolean comprobar_orden(){
        boolean ojos_check=(cant_ojos==orden_ojos);
        boolean cerebros_check=(cant_cerebros==orden_cerebros);
        boolean bichos_check=(cant_bichos==orden_bichos);
        boolean salsa_check=(pizza1.getColor_pizza()==orden_color);
        return(ojos_check==true & cerebros_check==true & bichos_check==true & salsa_check==true);
        }
    }

