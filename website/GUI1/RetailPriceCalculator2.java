//package ch12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RetailPriceCalculator2 extends JFrame{
    private JPanel panel;
    private JLabel messageLabel1;
    private JLabel messageLabel2;
    private JTextField wholesaleTextField;
    private JTextField markupTextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 400; // Window width in pixels
    private final int WINDOW_HEIGHT = 150; //Window height in pixels
    
    /**
     * Constructor
     */
    public RetailPriceCalculator2(){
        
        //Set Title bar text
        setTitle("Retail Price Calculator");
        
        //Set size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        //Specify an action when the user clicks the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Build Panel
        buildPanel();
        
        //Add panel to the JFrame object's content pane.
        add(panel);
        
        //Display window 
        setVisible(true);   
    }
    
    /**
     * buildPanel method builds a panel that is then added to the
     * ReetailPriceCalculator object's content pane. 
     */
    private void buildPanel(){
        
        //create messageLabels using JLabel class.
        messageLabel1 = new JLabel("Enter the wholesale cost " +
                                   "of your item");
        messageLabel2 = new JLabel("Enter the markup percentage " + 
                                   "of your item");
        
        //create the Text fields each ten characters wide using JTextFiled class.
        wholesaleTextField = new JTextField(10);
        markupTextField = new JTextField(7);
        
        //Create calcButton using JButton class.
        calcButton = new JButton("Retail Price");
        
        //Add an action listener to the caclButton
        calcButton.addActionListener(new CalcButtonListener());
        
        //Create panel using JPanel class.
        panel = new JPanel();
        
        //Add the messageLabels, the corresponding Text fields and 
        // the button to the panel to complete the building of panel.
        panel.add(messageLabel1);
        panel.add(wholesaleTextField);
        panel.add(messageLabel2);
        panel.add(markupTextField);
        panel.add(calcButton);
    }
    
    /**
     * CalcButtonListener is an action listener class for "Retail Price" button.
     */
    private class CalcButtonListener implements ActionListener{
        /**
         * The actionPerformed method executes when the 
         * user clicks the "Retail Price" button.
         * @param e The event Object
        */
        public void actionPerformed(ActionEvent e){
            String input1; //To hold the wholesaleTextField
            String input2; //To hold the markupTextField
            double wholesalePrice; //Wholesale price per item
            double markupPercentage; //Mark up percentage of each item
            
            //Get the text generated by the user into the two text fields.
            input1 = wholesaleTextField.getText();
            input2 = markupTextField.getText();
            
            //Convert inputs to wholesalePrice and mrkupPercentage respectively.
            wholesalePrice = Double.parseDouble(input1);
            markupPercentage = Double.parseDouble(input2);
            
            //Calculate the retail price
            double retailPrice = wholesalePrice +
                   wholesalePrice * markupPercentage/100.0;
            
            //Display the result
            JOptionPane.showMessageDialog(null, 
              String.format("Reatil Price: $%,.2f", retailPrice));
        }
    }
    
    /**
     * main method
     */
    public static void main(String[] args){
        new RetailPriceCalculator2();
    }

}