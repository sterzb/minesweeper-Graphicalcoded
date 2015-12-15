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

public class playerName
{
  public void paint(Graphics g){
  g.setColor(Color.red);
  g.setFont(new Font("TimesRoman", Font.PLAIN, 18));    
  g.drawString("playerName",90,330);
}
   
}
