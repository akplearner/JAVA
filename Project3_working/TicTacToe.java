//package pro3_tic;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class TicTacToe extends JPanel{
//instance variables
    JButton buttons[] = new JButton[9]; 
    int alternate = 0;
    //String[] ArrayGame = new String[10];
    static int gamePlayed=0;

    public TicTacToe()
    {
      setLayout(new GridLayout(3,3));
      initializebuttons(); 
    }
    
    public void initializebuttons()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setPreferredSize(new Dimension(120, 40)); 
            buttons[i].setText("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            buttons[i].addActionListener(new buttonListener());       
            add(buttons[i]); 
        }
    }
    public void resetButtons()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i].setText("");
        }
    }
    private class resetHandlerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            JButton resetClicked = (JButton)e.getSource(); 
            resetButtons();            
        }
    }
    private class buttonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            JButton buttonClicked = (JButton)e.getSource(); 
            if(alternate%2 == 0){
                buttonClicked.setText("X");
            }
            else{
                buttonClicked.setText("O");
            }
            if(checkForWin() == true)
            {
                gamePlayed++;
                JOptionPane.showConfirmDialog(null, "Game Over. Number of games played are: "+gamePlayed+" coninue?");
                String appleString = JOptionPane.showInputDialog("Enter number of apples:");
                resetButtons();
            }
            alternate++;
            
        }
        
        public boolean checkForWin()
        {
            
            if( checkAdjacent(0,1) && checkAdjacent(1,2) ) 
                return true;
            else if( checkAdjacent(3,4) && checkAdjacent(4,5) )
                return true;
            else if ( checkAdjacent(6,7) && checkAdjacent(7,8))
                return true;

            else if ( checkAdjacent(0,3) && checkAdjacent(3,6))
                return true;  
            else if ( checkAdjacent(1,4) && checkAdjacent(4,7))
                return true;
            else if ( checkAdjacent(2,5) && checkAdjacent(5,8))
                return true;
            
            else if ( checkAdjacent(0,4) && checkAdjacent(4,8))
                return true;  
            else if ( checkAdjacent(2,4) && checkAdjacent(4,6))
                return true;
            else 
                return false;   
        }
        
        public boolean checkAdjacent(int a, int b)
        {
            if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
                return true;
            else
                return false;
        }   
    }
    
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("TicTacToe Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel panel2 = new JPanel();
	    JLabel msg = new JLabel(" Welcome. \nclick here to give up ;P ");
	    panel2.add(msg);
	    JButton reset = new JButton("reset");
	    panel2.add(reset);
        
        window.getContentPane().add(panel2, BorderLayout.WEST);
        window.getContentPane().add(new TicTacToe(), BorderLayout.EAST);
        window.setBounds(300,200,700,700);
        window.setVisible(true);
        
        
    }
}
