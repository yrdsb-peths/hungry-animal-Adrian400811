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
        MouseInfo mouse = Greenfoot.getMouseInfo(); 
         
        if (mouse != null) 
        {  
           turnTowards(mouse.getX(), mouse.getY());  
        }
        move(5);
        
        if( isTouching(Apple.class) ) { 
            removeTouching(Apple.class);
          }
    }
    
    
}
