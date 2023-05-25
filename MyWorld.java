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
        GreenfootImage bg = new GreenfootImage("Geometry.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        Elephant e = new Elephant();
        sL = new Label("Score: "+score, 80);
        addObject(e, 100, 650);
        addObject(sL, 150, 50);
        createApple();
    }
    public void inScore(){
        score++;
        sL.setValue("Score: "+score);
    }
    public void kill(){
        Label goL = new Label("YOU DUMB", 100);
        addObject(goL, 640, 360);
        Label goS = new Label("Your Score: "+score, 50);
        addObject(goS, 640, 460);
        removeObject(sL);
    }
    public void createApple(){
        Apple a = new Apple();
        int appleX = Greenfoot.getRandomNumber(750);
        addObject(a, appleX, 100);
    }
}
