import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonListener implements ActionListener{
    int alternate = 0;//if this number is a even, then put a X. If it's odd, then put an O
    
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
           // gamePlayed++;
            JOptionPane.showConfirmDialog(null, "Game Over. Number of games played are: coninue?");
            //resetButtons();
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
