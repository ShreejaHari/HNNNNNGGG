import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Blocks
{
    Blook bx = new Blook();
    
    public hero()
    {
        getWorld().addObject(bx, 5, 1);
    }
    
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void rotate()
    {
        //int x = x;
        //int y = y;
        //rot = checkRotation(rot);
        /**
         *         if(rot == 0) {
            b1.setLocation(x-1,y);
            b2.setLocation(x,y);
            b3.setLocation(x+1,y);
            b4.setLocation(x+2,y);
        } else if(rot == 1) {
            b1.setLocation(x,y-1);
            b2.setLocation(x,y);
            b3.setLocation(x,y+1);
            b4.setLocation(x,y+2);
        } else if (rot == 2) {
            b1.setLocation(x-2,y);
            b2.setLocation(x-1,y);
            b3.setLocation(x,y);
            b4.setLocation(x+1,y);
        } else if(rot == 3) {
            b1.setLocation(x,y-2);
            b2.setLocation(x,y-1);
            b3.setLocation(x,y);
            b4.setLocation(x,y+1);
        }
         */

    }
    
    public boolean checkRot(int r)
    {
        return false;
    }
    
    public void renewLocation()
    {
        
    }
}
