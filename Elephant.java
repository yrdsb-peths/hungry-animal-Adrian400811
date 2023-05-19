import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author Adrian Lee 
 * @version 20230516
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int speed = 5;
        if(Greenfoot.isKeyDown("")){
            speed += 5;
        }
        if(Greenfoot.isKeyDown("d")){
            move(speed);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-speed);
        }
        if(isTouching(Apple.class) ) { 
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.inScore();
          }
    }
    
    
}
