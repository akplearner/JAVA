impor javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTac extends JFrame{
//Instance variables
	public int MAXCol=3; 
    public int MAXRow=3;
    JButton[][] boxButton = new JButton [3] [3];
//construtor
    /*
    public TicTac(){
        
    */
//Method
    public static void main (String[] args){
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(621,400);
        //panel 1
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new GridLayout(3,3,5,5));//(rows,cols,hgap,vgap)
        panel.setBackground(Color.BLACK);
        
        JButton boxButton1 = new JButton("1");
        JButton boxButton2 = new JButton("2");
        JButton boxButton3 = new JButton("3");
        JButton boxButton4 = new JButton();
        JButton boxButton5 = new JButton();
        JButton boxButton6 = new JButton();
        JButton boxButton7 = new JButton();
        JButton boxButton8 = new JButton();
        JButton boxButton9 = new JButton();
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); //add like an array
        panel.add(boxButton1);
        panel.add(boxButton2);
        panel.add(boxButton3);
        panel.add(boxButton4);
        panel.add(boxButton5);
        panel.add(boxButton6);
        panel.add(boxButton7);
        panel.add(boxButton8);
        panel.add(boxButton9);
        
        //PANEL2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4,1,1,1));
        JLabel labelOne = new JLabel("This would be  Label 1");
        JLabel labeltwo = new JLabel("");
        JButton restartButton = new JButton("Restart");
            //restartButton.setActionCommand("Restart Handle");
            //String command = restartButton.getActionCommand();
            
            
            //restartButton.setPreferredSize(new Dimension(200,50));
        //button action
        panel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel2.add(labelOne);
        panel2.add(labeltwo);
        panel2.add(restartButton);
        frame.add(panel,BorderLayout.WEST);
        frame.add(panel2,BorderLayout.EAST);
    }
   
}