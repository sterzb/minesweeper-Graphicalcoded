
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
public class player extends JComponent{
 
public static String player = JOptionPane.showInputDialog("Enter Player Name ","Enter Name Here");  
  Object thankYouPane = JOptionPane.showConfirmDialog(null,
              "Is your name " + player + " ?","Thank You For Playing", JOptionPane.YES_NO_OPTION);
                       
  public void paint(Graphics g){
  g.setColor(Color.red);
  g.setFont(new Font("TimesRoman", Font.PLAIN, 18));    
  g.drawString(player,90,330);
}

    }

 