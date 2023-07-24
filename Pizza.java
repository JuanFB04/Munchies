import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    /**
     * Pizza
     */
    String color_pizza;
    
    public void act(){
    if(Greenfoot.isKeyDown("a")){
        agregar_Smorada();
        Greenfoot.delay(10);
    }
    if(Greenfoot.isKeyDown("s")){
        agregar_Sazul();
        Greenfoot.delay(10);
    }
    if(Greenfoot.isKeyDown("d")){
        agregar_Sverde();
        Greenfoot.delay(10);
        }
    
    }

    /**
     * Agregar salsas
     */
    public void agregar_Smorada(){
        setImage("Pizza_morada.png");
        color_pizza="morado";
    }
       public void agregar_Sazul(){
        setImage("Pizza_azul.png");
        color_pizza="azul";
    }
    public void agregar_Sverde(){
        setImage("Pizza_verde.png");
        color_pizza="verde";
    }

}
