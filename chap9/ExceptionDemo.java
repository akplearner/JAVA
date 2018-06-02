import java.util.Scanner;

public class ExceptionDemo{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        try{
            System.out.println("Enter numb of donuts.");
            int donutCount= kb.nextInt();
            System.out.println("Enter number of glasses of milk:");
            int milkCount = kb.nextInt();
            //Exception e=new Exception("Exception: No Milk!");
            if(milkCount<1){
                  throw new Exception("Exception: No Milk");
            }

            double donutsPerGlass = donutCount / (double)milkCount; 
            System.out.println(donutCount + " donuts."); 
            System.out.println(milkCount + " glasses of milk."); 
            System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");
        
        }catch(Exception exception){
            System.out.println(exception.getMessage());
            System.out.println("Go buy some milk.");
        }
        System.out.println("End of Program.");
    }
}