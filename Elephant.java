import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author Adrian Lee 
 * @version 20230516
 */
public class Elephant extends Actor
{
    GreenfootSound scream = new GreenfootSound("elephantcub.mp3");
    GreenfootImage swing = new GreenfootImage("elephant.png");
    GreenfootImage swingL = new GreenfootImage("elephant.png");
    
    boolean faceRight = true;
    
    public Elephant(){
        swingL.mirrorHorizontally();
    }
    
    int aIndex = 0;
    public void animate(){
        if(faceRight = true){
            setImage(swing);
        } else {
            setImage(swingL);
        }
    }
    
    public void act()
    {
        // Add your action code here.
        int speed = 5;
        if(Greenfoot.isKeyDown("shift")){
            speed = 10;
        }
        if(Greenfoot.isKeyDown("d")){
            move(speed);
            faceRight = true;
            animate();
        }
        if(Greenfoot.isKeyDown("a")){
            move(-speed);
            faceRight = false;
            animate();
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
