import java.util.Scanner;
public class OutputFormat{
   /**
    Display a number with digitsAfterPoint digitsafter the decimal point.
    Rounds any extra digits.
    */
    public static void writeln( double newAmount, int newSize ){
        System.out.print("$");
        write(newAmount, newSize);
        System.out.println("writelnClose");
    }
    public static void write( double number, int digitsAfterPoint ){ 
        if(number >=0){
            writePositive(number, digitsAfterPoint);
        }else{
            double positiveNumber = -number;
            System.out.print("-");
            writePositive(positiveNumber,digitsAfterPoint);
        }
    }
    private static void writePositive(double number, int digitsAfterPoint){
        int mover = (int)Math.pow(10,digitsAfterPoint);
        //1 followed by digitsAfterPoint places
        int allWhole; //num with decimal point moved
        allWhole = (int)Math.round(number*mover);
        int beforePoint = allWhole/mover;
        int afterPoint = allWhole%mover;
        System.out.println(beforePoint+".");
        writeFraction(afterPoint,digitsAfterPoint);
    }
    private static void writeFraction(int afterPoint, int digitsAfterPoint){
        int n=1;
        while(n<digitsAfterPoint){
            if(digitsAfterPoint < Math.pow(10,n)){
                System.out.print("0");
            }
            n=n+1;
        }
        System.out.println(afterPoint);
    }
   /** 
    * Display a number with  digitsAfterPoint digits after the decimal point.
    Rounds any extra digits.
    Advances to the next line after output.
   */
   public static void main(String[] args){
        System.out.println("Enter amount and  size of decimal.");
        Scanner kb = new Scanner(System.in);
        double amount = kb.nextDouble();
        int sizeDeci = kb.nextInt();  
        //System.out.println(amount +" "+ sizeDeci);
        OutputFormat.writeln(amount,sizeDeci);
    }
}