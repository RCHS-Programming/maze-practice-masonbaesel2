import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (Mason Baesel) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    private String image;
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    public Wall( String imageName )
    {
        image = imageName;
        setImage( image );
    }
}
