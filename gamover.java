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

    /**
     * Constructor for objects of class gamover.
     * 
     */
    public gamover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        showText("Puntuacion final: " +finalScore, getWidth() / 2, getHeight() / 11);
    }
    
    public static void prepare(int score){
        finalScore = score;
    }

}
