//package ch12;

import javax.swing.*;

public class EmbeddedMain extends JFrame {
    
    /** Constructor */
    public EmbeddedMain(){
        
        final int WINDOW_WIDTH = 350; //window width in pixels
        final int WINDOW_HEIGHT = 250; //window height in pixels
        
        //Set this window's title
        setTitle("A Simple Window");
        
        //Set the size of this window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        //Specify what happens when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Display the window
        setVisible(true);      
    }
    
    /** The main method creates an instance of the 
     * EmbeddedMain class, which causes it to display the 
     * window.
    */
    public static void main(String[] args){
        EmbeddedMain myWindow = new EmbeddedMain();
    }
    
    
    
}