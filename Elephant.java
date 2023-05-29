import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object Elephant
 * 
 * @author Adrian Lee 
 * @version May 2023
 */
public class Elephant extends Actor
{
    GreenfootSound scream = new GreenfootSound("elephantcub.mp3");
    GreenfootImage swing = new GreenfootImage("elephant.png");
    GreenfootImage swingL = new GreenfootImage("elephant.png");
    
    public Elephant(){
        swingL.mirrorHorizontally();
    }
    
    int aIndex = 0;
    public void act()
    {
        // Add your action code here.
        int speed = 5;
        if(Greenfoot.isKeyDown("shift")){
            speed = 10;
        }
        if(Greenfoot.isKeyDown("d")){
            move(speed);
            setImage(swing);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-speed);
            setImage(swingL);
        }
        if(isTouching(Apple.class) ) { 
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.inScore();
            setImage("elephant.png");
            scream.play();
          }
    }
}
