import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlescreen extends World
{

    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        super(500, 500, 1);
        setBackground("Titlescreen.png");
        addObject(new startbutton(),250, 360);
        showText("Presionar espacio después",250,450);
        showText("después de esta pantalla para empezar",250,470);
    }
}
