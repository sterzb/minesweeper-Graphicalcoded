
/**
 * Write a description of class board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.lang.Integer;
import java.util.EventListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.lang.Math;

class board extends JComponent{
//public int xx = ;
//public int yy =; 
//public void main(String[] args) {      
    String [] options = {"5x5","10x10","15x15","30x30"};
 public int selectedSize = Integer.parseInt((String)JOptionPane.showInputDialog("Choose board size(5, 10, 15, or 30) :","15"));           
 public int xx = selectedSize;
 public int yy = selectedSize;
public int totalBlocks;
public int tileArray[][];
    

public void paint(Graphics g) {

//public int  xx = this.xx;
//public int yy = this.yy;      
int userModX = 300;
int userModY = 300;    
//int x = 15;// 5x5 10x10 15x15 30x30
          //   future user input  must be divisible by 300 for int 
//int y = 15;// future user input  must be divisable by 300 for int
int userInputX = userModX / xx; //blocks per row
int userInputY = userModY / yy;  //blocks per column
int yMove = userInputY; //moves column over
int c = 25;
int totalBlocks = this.xx * this.yy; //total blocks
int [][] tileArray = new int[xx][yy];
String name = player.player;//future name var
String score = statistics.scoreBoard; // future imported score 

 //addMouseListener(this);
 //addMouseListener(this);
// block Array to hold pieces 
//public void paint(Graphics g) {
    g.drawRect (25, 25, 300, 300);//game outline   
    g.drawRect (25, 325, 300,100);//stats outline
    g.setColor(Color.yellow);
    g.fillRect (26, 326, 298,98);
    g.setColor(Color.red);
    g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    g.drawString("Player: "+ name,30,355); //draws word Player to gameboard
    g.drawString("Score:"+ score,30,395);  //draws score holder to gameboard
    g.drawRect(25,25,userInputX,userInputY);
    for (int r = 0; r<yy; r++){ //produces columns
        int counterFack = 1;
        counterFack=counterFack++;
        
        for (int i = 0; i<xx;i++){ //produc
        int m = 1;
        m=m++;
        int move = i * userInputY;
        g.setColor(Color.black);
        g.drawRect( 25 + move ,c,userInputX,userInputY);
         g.setColor(Color.white);
        g.fillRect( 25 + move+1 ,c+1,userInputX-2,userInputY-2);
        int hNum = m*counterFack;
        tileArray[r][i]= hNum;
  }
        c = c + yMove;
}

}

    
    
}
//public void mouseClicked(MouseEvent e ){

  