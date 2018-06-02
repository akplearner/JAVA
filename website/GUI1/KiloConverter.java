import javax.swing.*; //neded for swing classes
import java.awt.event.*; //needed for ActionListener Interace

public class KiloConverter extends JFrame{
//instance variables    
    private JPanel panel; // to reference a panel
    private JLabel messageLabel1; //reference a lab1
    private JTextField kiloTextField; // reference text field.
    private JButton calcButton; //reference a button
    private final int WIND_WIDTH = 350;
    private final int WIND_HEIGHT = 100; 
//constructor  
    public KiloConverter(){
        //window title
        setTitle("kilometer converter");
        //wind size
        setSize(WIND_WIDTH,WIND_HEIGHT);
        //action when close button clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //build panel and add it to JFrame
        buildPanel(); // messages,bottons and other inside this method.
        //add panel to frame's content pane
        add(panel); //after its  instances been modified by buildPanel() method
        //display window
        setVisible(true);
    }
//set and getters
//methods
    private void buildPanel(){
        //create a label to display instuctions
        messageLabel1= new JLabel("Enter a distance in Kilometers");
        //create text field of 10 char wide
        kiloTextField = new JTextField(10);
        //create button with caption "calculate"
        calcButton = new JButton("Calculate");
        //add action listener to the button
        calcButton.addActionListener(new CalcButtonListener());//need to create method called calcButtonListener
        //Create a JPanel object and let the Panel field refeence it.
        panel = new JPanel();
        //add the label, text field, and button components to the panel
        panel.add(messageLabel1);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
    /** calcButtonListener is an action listener class for the Calculate botton. */
    private class CalcButtonListener implements ActionListener{ /** 
        * The actionPerformed method executes when the user clicks
        * on the Calculate button.
        * @param e The event object.   
       */
       
       public void actionPerformed(ActionEvent e){
           final double CONVERSION = 0.6214;
           String input; // To hold the user's input
           double miles; // The number of miles
           
           //Get the text entered by the user into the text field.
           input = kiloTextField.getText();
           
           //Convert the input to miles.
           miles = Double.parseDouble(input) * CONVERSION;
           
           //Display the result.
           JOptionPane.showMessageDialog(null, input +
                   " kilometers is " + miles + " miles.");
       }
   }
   
   /** main method */
   public static void main(String[] args){
       
       new KiloConverter();
   }
}