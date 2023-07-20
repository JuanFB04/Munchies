import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tortuga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tortuga extends Actor
{
    /**
     * Act - do whatever the Tortuga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(0,0);
        if(Greenfoot.isKeyDown("a")){
            move(5);
        }
    }
}
