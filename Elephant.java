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
    GreenfootImage[] swing = new GreenfootImage[8];
    GreenfootImage[] swingL = new GreenfootImage[8];
    boolean faceRight = true;

    public Elephant(){
        for(int i = 0; i<swing.length; i++){
                swing[i] = new GreenfootImage("images/elephant_idle/idle"+i+".png");
        }
        for(int i = 0; i<swingL.length; i++){
                swingL[i] = new GreenfootImage("images/elephant_idle/idle"+i+".png");
        }
    }
    
    int aIndex = 0;
    public void animate(){
        if(faceRight = true){
            setImage(swing[aIndex]);
            aIndex = (aIndex +1) %swing.length;
        } else {
            setImage(swingL[aIndex]);
            aIndex = (aIndex +1) %swingL.length;
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
        }
        if(Greenfoot.isKeyDown("a")){
            move(-speed);
            faceRight = false;
        }
        if(isTouching(Apple.class) ) { 
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.inScore();
            animate();
            setImage("elephant.png");
            scream.play();
          }
    }
}
