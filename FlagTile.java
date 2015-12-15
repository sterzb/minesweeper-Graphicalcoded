
/**
 * Write a description of class FlagTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.awt.Graphics;
public class FlagTile extends tile
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class mineTile
     */
    public FlagTile()
    {
        g.drawRect (flagTileX,flagTileY,length,height);// initialise instance variables
        new Color.yellow();
        g.fillRect (flagTileX,flagTileY,length,height);
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
