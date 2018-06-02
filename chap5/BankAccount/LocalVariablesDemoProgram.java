//5.5
public class LocalVariablesDemoProgram{
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();
        myAccount.amount = 100.00;
        myAccount.rate = 5;
        //different newAmount then class BankAccount.
        double newAmount = 800.00;
        myAccount.showNewBalance();
        System.out.println("I wish my new amount were $" + newAmount);
    }
}