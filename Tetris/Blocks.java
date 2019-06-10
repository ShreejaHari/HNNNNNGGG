import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Blocks extends Actor
{
    private int Cox =0;
    private int Coy = 0;
    public int rot;
    
    public Blook b1;
    public Blook b2;
    public Blook b3;
    public Blook b4;
    
    private final int maxC = 750;
    private int counter = maxC;
    
    private String[] keyList = {"up", "down", "left", "right"};
    private boolean[] keyDown = new boolean[keyList.length];
    
    
    public int checkRotations(int rot)
    {
        rot = rot%4;
        
        return rot;
    }
    
    protected abstract void renewLocation();
    
    protected abstract boolean checkRot(int r);
    
    public void setPosition(int x, int y)
    {
        Cox = x;
        Coy = y;
        renewLocation();
    }
    
    protected boolean doesIsPosition( int x, int y)
    {
        if(x >= 0 && x<= 9 && y>= 0 && y<=17)
        {
            return true;
        }
        
        return false;
    }
    
    public boolean cHeCkPlEaSe(int x, int y)
    //check all
    {
        boolean blook1 = doesIsPosition(b1.getX() + x, b1.getY() +y);
        boolean blook2 = doesIsPosition(b2.getX() + x, b2.getY() +y);
        boolean blook3 = doesIsPosition(b3.getX() + x, b3.getY() +y);
        boolean blook4 = doesIsPosition(b4.getX() + x, b4.getY() +y);
        if (blook1 && blook2 && blook3 &&blook4)
        {
            return true;
        }
        return false;
    }
    
    @Override public void addedToWorld(World world)
    {
        Cox = getX();
        Coy = getY();
        b1 = new Blook();
        b2 = new Blook();
        b3 = new Blook();
        b4 = new Blook();
        
        GreenfootImage i = b1.getImage();
        b2.setImage(i);
        b3.setImage(i);
        b4.setImage(i);
        
        world.addObject(b1,0,0);
        world.addObject(b2,0,0);
        world.addObject(b3,0,0);
        world.addObject(b4,0,0);
        renewLocation();
        
        setLocation(0,0);
    }
    
    /**
     * Act - do whatever the Blocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override public void act() 
    {
        for(int i = 0; i < keyList.length; i++) {
            String k = keyList[i];
            boolean b = Greenfoot.isKeyDown(k);
            if((keyDown[i] != b) && b) {
                if(i == 0) 
                {
                    if(checkRot(rot - 1)) {
                        rot = rot - 1;
                    }
                } 
                else if(i == 1) 
                {
                    if(checkRot(rot + 1)) {
                        rot = rot + 1;
                    }
                } 
                else if(i == 2) 
                {
                    if(cHeCkPlEaSe(-1,0)) {
                        Cox = Cox - 1;
                    }
                } 
                else if(i == 3) 
                {
                    if(cHeCkPlEaSe(1,0)) {
                        Cox = Cox + 1;
                    }
                } 
                else if(i == 4) 
                { // up
                    if(cHeCkPlEaSe(0,-1)) {
                        Coy = Coy - 1;
                    }
                } 
                else if(i == 5) 
                { // down
                    if(cHeCkPlEaSe(0,1)) {
                        Coy = Coy + 1;
                    }
                }
            }
            keyDown[i] = b;
        }
        
        if(canFall()) 
        {
            counter = counter - 1;
            if(counter <= 0) {
                Coy = Coy + 1;
                counter = maxC;
            }
        } 
        else 
        {
            getWorld().removeObject(this);
        }
        renewLocation();
    }
    
    protected boolean canFall()
    {
        return cHeCkPlEaSe(0, 1);
    }
}
