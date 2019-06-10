import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blook extends Actor
{
    public Blook()
    {
        int i = (int)(Math.random()*7+1);
        
        if (i==1)
        {
            this.setImage("RedBlook.png");
        }
        if (i==2)
        {
            this.setImage("OrangeBlook");
        }
        if (i==3)
        {
            this.setImage("YellowBlook");
        }
        if (i==4)
        {
            this.setImage("GreenBlook");
        }
        if (i==5)
        {
            this.setImage("BlueBlook");
        }
        if (i==6)
        {
            this.setImage("PurpleBook");
        }
        if (i == 7)
        {
            this.setImage("RainbowBlook");
        }
    }
    
    
    /**
     * Act - do whatever the Blook wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
