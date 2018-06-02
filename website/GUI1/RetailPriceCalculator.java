//package ch12;

import javax.swing.*;

public class RetailPriceCalculator extends JFrame {
    private JPanel panel;
    private JPanel panel2;
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
    public RetailPriceCalculator(){
        
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
     * main method
     */
    public static void main(String[] args){
        new RetailPriceCalculator();
    }
}