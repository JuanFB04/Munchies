import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ojo_topping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ojo_topping extends Actor
{
    /**
     * 
    */
    public void act()
    {
        if (Greenfoot.isKeyDown("Enter")){
        move(5);
    }
    if (Greenfoot.isKeyDown("l")){
        move(-5);
    }
    }
}
