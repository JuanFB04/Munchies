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
    
    public Pizza(String color_pizza){
        this.color_pizza = color_pizza;
    }
    
    public String getColor_pizza(){
        return color_pizza;
    }
    public void setColor_pizza(){
        this.color_pizza=color_pizza;
    }
    
    public void act(){
    if(Greenfoot.isKeyDown("a")){
        agregar_Smorada();
    }
    if(Greenfoot.isKeyDown("s")){
        agregar_Sazul();
    }
    if(Greenfoot.isKeyDown("d")){
        agregar_Sverde();
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
     public void quitar_Salsa(){
        setImage("Pizza.png");
        color_pizza="neutral";
    }

}
