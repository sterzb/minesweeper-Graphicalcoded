
/**
 * Tile class to randomly choose "mine" tiles
 * 
 * @juggaloSix 
 * @10/18/2015
 */
import java.awt.Window;
 import java.awt.Dialog;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JOptionPane;
 import javax.swing.JTextField;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.Graphics;
 import javax.swing.JComponent;
 import java.awt.Color;
 import java.awt.Font;
 import java.util.Random;
 import java.util.EventListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class tile extends board
{// public  int mineY;
    public  int mineX;
    public  int leftOver;
    public int blankX;
   // public int blankY;
    public int height = 5;
    public int length = 5;
  
     //* randomly generates mine tile array position to initialize mineTile
    
     int totalBlocks = length * height;
    String [] options = {"1","2","3","4","5"};
 
    
  //String selectedSize =(String)JOptionPane.showInputDialog(null,"Choose board size:","Input",JOptionPane.INFORMATION_MESSAGE, null, options,options[0]);
  public void main(String[] args){
  int MineMax = Integer.parseInt(JOptionPane.showInputDialog("How many mines?")); 
 
  //int height = board.xx;
  //int length = board.xx;
  //public static int mineCoordGen() 
    {    // initialise instance variables
       //String[][] tileArray = tileArray;
       //String[][] tileArray = new String[xx][yy];                                 
       Random randomGenerator = new Random(); 
       for (int r = 0; r<MineMax; r++){ 
           //Random randomGenerator = new Random();
           int mineX = randomGenerator.nextInt(height);
           int mineY = randomGenerator.nextInt(length);
            //int mineY = randomGenerator.nextInt(length);
           tileArray[mineX][mineY] = 99999;
        }      
   //     for (int c = 0; i<=totalBlocks; i++){
   //         if(tileArray[i] != "mine"){
   //         }else if (tileArray[i] != "flag"){
   //             tileArray[i] = "blank";
  //          }

   }
    } 
     //System.out.println(String tileArray);
  //  return mineX;
}    

