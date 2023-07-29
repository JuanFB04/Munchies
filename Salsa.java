import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Salsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salsa extends Actor
{
    /**
     * Act - do whatever the Salsa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void Cambio_salsa(String color){
        if(color=="morado"){
            setImage("Salsa_morada.png");
        }
        if(color=="azul"){
            setImage("Salsa_azul.png");
        }
        if(color=="verde"){
            setImage("Salsa_verde.png");
        }
    }
}
