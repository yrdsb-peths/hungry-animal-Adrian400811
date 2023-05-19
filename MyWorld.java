import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label sL;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        Elephant e = new Elephant();
        sL = new Label(0, 80);
        addObject(e, 100, 700);
        addObject(sL, 50, 50);
        createApple();
    }
    public void inScore(){
        score++;
        sL.setValue(score);
    }
    public void kill(){
        Label goL = new Label("YOU DUMB", 100);
        addObject(goL, 640, 360);
    }
    public void createApple(){
        Apple a = new Apple();
        int appleX = Greenfoot.getRandomNumber(750);
        addObject(a, appleX, 100);
    }
}
