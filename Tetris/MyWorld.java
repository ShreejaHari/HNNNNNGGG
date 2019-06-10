import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    private Blook[][] thingamajig;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(20, 18, 40); 
        
        setBackground("witeBlook.png");
        
        thingamajig = new Blook[15][9];
        prepare();
        act();
    }
    
    public void prepare()
    {
        
    }
    
    public void act()
    {
        //
        showText("Let's play tetris! stack the blocks so \n" +
                "they complete rows and disappear.\n" +
                "Use the arrow keys \n" +
                "up will rotate your piece ninty degrees\n"+
                "left/right will move it", 15, 1);
    }
}
