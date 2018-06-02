//5.5
/**
 This class is used in the program LocalVariablesDemoProgram.
 */
public class BankAccount{
    public double amount;
    public double rate;
    public void showNewBalance(){
        //This does not change the value of the varibale newAmount in main.
        double newAmount = amount + (rate/100.0) * amount;
        System.out.println("With interest added, the new amount is $" + newAmount);
    }
}
