import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gamover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gamover extends World
{
    private static int finalScore;

    public gamover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        GreenfootImage img = new GreenfootImage(200,50);
        showText("Puntuacion final: "+finalScore, 250, 400);
        addObject(new menubutton(),250, 350);
    }
    
    public static void prepare(int score){
        finalScore = score;
    }

}
