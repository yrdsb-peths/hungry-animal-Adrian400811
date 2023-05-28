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
    public int setTime = 10000;
    public int time = 0;
    Label sL;
    Label tL;
    SimpleTimer gameTime = new SimpleTimer();
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
        sL = new Label("Score: "+score, 70);
        tL = new Label("Time: "+time, 70);
        addObject(e, 100, 650);
        addObject(sL, 150, 50);
        addObject(tL, 700, 50);
        createApple();
    }
    public void act(){
        time = gameTime.millisElapsed()/1000;
        tL.setValue("Time: "+ ((setTime - time)/1000));
    }
    public void inScore(){
        score++;
        sL.setValue("Score: "+score);
    }
    public void kill(){
        Label goL = new Label("He gave you up", 100);
        addObject(goL, 640, 300);
        Label goS = new Label("Your Score: "+score, 50);
        addObject(goS, 640, 500);
        removeObject(sL);
    }public void dropKill(){
        Label goL = new Label("Never gonna give you up", 100);
        addObject(goL, 640, 300);
        Label goS = new Label("Your Score: "+score, 50);
        addObject(goS, 640, 500);
        removeObject(sL);
    }
    public void createApple(){
        gameTime.mark();
        if(gameTime.millisElapsed() < setTime){
            Apple a = new Apple();
            if(score%5 == 0){
            a.inSpeed(1);
            }
            int appleX = Greenfoot.getRandomNumber(1000);
            addObject(a, appleX, 100);
        } else {
            dropKill();
        }
    }
}
