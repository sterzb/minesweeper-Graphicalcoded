
/**
 * Write a description of class statistics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)

   
   */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;
  
public class statistics extends JComponent
{

    
    public static String scoreBoard = "Score goes here"; 
    // instance variables - replace the example below with your own
    public void newStats(Graphics g){
        //display stats at(30,330)
         g.setColor(Color.black);
         g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
         g.drawString("00",150,395); //draws actual Score 
        }
    }

   

