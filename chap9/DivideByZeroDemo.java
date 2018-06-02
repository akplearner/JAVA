import java.util.Scanner;

public class DivideByZeroDemo{
    private int num;
    private int denum;
    private double quotient;

    public static void main(String[] args){
        DivideByZeroDemo oneTime = new DivideByZeroDemo();
        oneTime.doIt();
    }
    public void doIt(){
        try{
            System.out.println("Enter num:");
            Scanner kb= new Scanner(System.in);
            num = kb.nextInt();
            System.out.println("Enter denominator: ");
            denum = kb.nextInt();
            if(denum ==0){
                throw new DivideByZeroException();
            }
            quotient = num/(double)denum;
            System.out.println(num + "/" + denum + " = " + quotient);
        }catch(DivideByZeroException e ){
            System.out.println(e.getMessage());
        }
    }

}