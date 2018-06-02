//listing 6.14
import java.util.Scanner;
public class DollarFormat{
    public static void write(double amount){
        if(amount>=0){
            System.out.print("$");
            writePositive(amount);
        }else{
            double positiveAmount = amount;
            System.out.print("$"+"-"+positiveAmount); //for negative amount of money
            writePositive(positiveAmount);
        }
    }
    //Precondition: amount>=0
    //Display amount in dollars and cents notation.
    //Rounds after two decimal places. Omits the dollar sign.
    private static void writePositive(double amount){
        int allCents = (int)(Math.round(amount*100));
        int dollars = allCents/100;
        int cents = allCents%100;

        System.out.print(dollars);
        System.out.print(".");      
        
        if(cents<10)
            System.out.print('0');
        System.out.print(cents);
    }
    /**
     * Display amount in dollar and cents notation.
     * Round after two decimal places.
     * Advances to the next line after output.
     */
    public static void writeln(double amount){
        write(amount);
        System.out.println();
    }
    
    public static void main(String[] args){
        double amount;
        String response;
        Scanner kb = new Scanner(System.in);
        do{
            System.out.println("enter value of type double:");
            amount = kb.nextDouble();
            DollarFormat.write(amount);
            System.out.println("\n"+"Test again?");
            response = kb.next();
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("End of test.");
    }
}