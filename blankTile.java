
/**
 *produces a blank tile for game play.
 * 
 * juggaloSix 
 * 10/18/2015
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;

public class blankTile extends tile 
{

    // instance variables - replace the example below with your own
    public double blankTile;
    public double unusedBlankTile;

    /**
     * Constructor for objects of class blankTile
     */
   int startPositionX = 25;
   int startPositionY = 25;
   int adderX = 300 / board.length;
   public void paint(Graphics g){
   g.drawRect(coordX,coordY,adderX,adderX);
   new Color.WHITE();
   g.fillRect(coordX,coordY,adderX,adderX);
   return blankTile;
        // initialise instance variables
    }
}

   
    
       // blankTile =  g.drawRect(board.coordX, board.coordY, board.adderX,board.adderX);
        //fillRect(0,0,0,0);// put your code here
        //return blankTile;
        
    //}
//}
