
/**
 * Write a description of class gameMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class gameMain {
 
  public static void main(String[] a) {
   new player(); 
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(40, 40, 400, 500);
   
    window.getContentPane().add(new board());
    window.setVisible(true);
          
  
    }
  

  
  }


            

