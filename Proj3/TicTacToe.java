// By Anthony Pena

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class TicTacToe extends JPanel{
    //instance variables 
    JButton buttons[] = new JButton[9]; 
    int alternate = 0;//if this number is a even, then put a X. If it's odd, then put an O
    static int gamePlayed=0;
    //Constructors
    public TicTacToe()
    {
      setLayout(new GridLayout(3,3));
      initializebuttons(); 
    }

    //Methods1
    public void initializebuttons()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].setPreferredSize(new Dimension(150, 150)); 
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 50));
            buttons[i].setBackground(Color.white);
            buttons[i].addActionListener(new buttonListener());       
            add(buttons[i]); //adds this button to JPanel (note: no need for JPanel.add(...)
                                //because this whole class is a JPanel already           
        }
    }
    //mathod2
    public void resetButtons()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i].setText("");
        }
    }
    
    // when a button is clicked, it generates an ActionEvent. Thus, each button needs an ActionListener. When it is clicked, it goes to this listener class that I have created and goes to the actionPerformed method. There (and in this class), we decide what we want to do

private class buttonListener implements ActionListener{
    public void actionPerformed(ActionEvent e) 
    {
        JButton buttonClicked = (JButton)e.getSource(); //get the particular button that was clicked
        if(alternate%2 == 0){
            buttonClicked.setText("X");
        }
        else{
            buttonClicked.setText("O");
        }
        if(checkForWin() == true){
            gamePlayed++;
            JOptionPane.showConfirmDialog(null, "Game Over. Number of games played are: "+gamePlayed+" coninue?");
            resetButtons();
        }
        alternate++;
            
    }
        
    public boolean checkForWin(){
            /**   Reference: the button array is arranged like this as the board
             *      0 | 1 | 2
             *      3 | 4 | 5
             *      6 | 7 | 8
             */
        //horizontal win check
        if( checkAdjacent(0,1) && checkAdjacent(1,2) ) //no need to put " == true" because the default check is for true
            return true;
        else if( checkAdjacent(3,4) && checkAdjacent(4,5) )
            return true;
        else if ( checkAdjacent(6,7) && checkAdjacent(7,8))
            return true;
        //vertical win check
        else if ( checkAdjacent(0,3) && checkAdjacent(3,6))
            return true;  
        else if ( checkAdjacent(1,4) && checkAdjacent(4,7))
            return true;
        else if ( checkAdjacent(2,5) && checkAdjacent(5,8))
            return true;
        //diagonal win check
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
    public static void main(String[] args){
        JFrame window = new JFrame("TicTacToe Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel2 = new JPanel();
        JLabel msg = new JLabel(" Welcome. Enter your name please. ");
        JTextField txtArea = new JTextField(10);
        panel2.add(msg);
        panel2.add(txtArea);
        JButton reset = new JButton("Reset");
        //  reset.addActionListener(buttonListener()); 
        //panel2.add(reset);
    
        window.getContentPane().add(panel2, BorderLayout.NORTH);
        window.getContentPane().add(new TicTacToe(), BorderLayout.SOUTH);
        //window.getContentPane().add(new TicTacToe());
        window.setBounds(300,300,900,700);
        window.setVisible(true);
    }
}
