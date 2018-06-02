//listing 6.12
import java.util.Scanner;
public class DollarFormatFirstTryDriver{
    public static void main(String[] args){
        double amount;
        String response;
        Scanner kb = new Scanner(System.in);
        do{
            System.out.println("enter value of type double:");
            amount = kb.nextDouble();
            DollarFormatFirstTry.write(amount);
            System.out.println("\n"+"Test again?");
            response = kb.next();
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("End of test.");
    }
}