import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    Label titleLabel = new Label("IndiHome Paket Phoenix",70);
    Label startLabel = new Label("Press Space to Start", 30);
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        GreenfootImage bg = new GreenfootImage("Geometry.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(startLabel, getWidth()/2, getHeight()/2+100);
        Elephant es = new Elephant();
        addObject(es, getWidth()/2, getHeight()/2-100);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("space")){
           MyWorld gameWorld = new MyWorld();
           Greenfoot.setWorld(gameWorld);
        }
    }
}
