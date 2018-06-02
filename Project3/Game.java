import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game extends JPanel {
//instance variables
	JPanel gamePanel = new JPanel();
	JButton[][] boxButton = new JButton [3] [3];
//constructor
	public Game() {
		for(int i=0 ; i<3 ; i++){
	        for(int j=0 ; j<3 ; j++){
	        	boxButton[i][j] = new JButton("a");
	            //boxButton[i][j].setActionCommand(I + " " +j);
	            //boxButton[i][j].setActionListener(this);
	        }
	    }
	    //reset.setActionCommand("reset");
	    //reset.addActionListener(this);
	}
	public static void main (String[] args){
        gamePanel.setPreferredSize(new Dimension(400,400));
        gamePanel.setLayout(new GridLayout(3,3,5,5));//(rows,cols,hgap,vgap)
        gamePanel.setBackground(Color.BLACK);
		
	}
}
