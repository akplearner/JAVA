import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class JOptionPaneDemo {
    public static void main(String[] args) {
       /* String appleString = JOptionPane.showInputDialog("Enter number of apples:");
        int appleCount = Integer.parseInt(appleString);
        String orangeString =JOptionPane.showInputDialog("Enter number of oranges:");
        int orangeCount = Integer.parseInt(orangeString); 
        int totalFruitCount = appleCount + orangeCount; 
        JOptionPane.showMessageDialog(totalFruitCount,"The total number of fruits = " + totalFruitCount); 
        */
        String numberString = JOptionPane.showInputDialog("Enter a number with decimal point:");
        double decimalNumber = Double.parseDouble(numberString);
        JOptionPane.showMessageDialog(decimalNumber,"the number of floatingis:"+decimalNumber);
        
        System.exit(0); 
    } 
}