import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

// Game Board Consists of 300 x 300 units
//user inputs size of board from 10 to 300
int x = 15;// future user input  must be divisible by 300 for int 
int y = 15;// future user input  must be divisable by 300 for int
int  userInputX = 300/x; //blocks per row
int userInputY = 300/y;  //blocks per column
int yMove = userInputY; //moves column over
int c = 25; // Y starting coordinate for drawing blocks
 public void paint(Graphics g) {
    g.drawRect (25, 25, 300, 300);//game outline   
    g.drawRect (25, 325, 300,100);//stats outline
    g.drawRect(25,25,userInputX,userInputY);
    for (int r = 0; r<y; r++){ //produces columns
        for (int i = 0; i<x;i++){ //produc
        int move = i * userInputY;
        g.drawRect( 25 + move ,c,userInputX,userInputY);      
  }
        c = c + yMove;
}

}
}



public class DrawRect {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(40, 40, 400, 500);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}