import java.util.Scanner; 
//Importing the Scanner class from java utilities library

/**
 * This the first java program of this class.
 * The program is going to read two integers
 * from the key board and print the sum.
 * Then it is going to print a series of strings. 
 * */

public class MyFirstJavaProgram {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int a, b;
        String str= "Hello!";
        
        
        System.out.println("Enter any two integers: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        
        
        
        System.out.println("The sum of "+ a + " and " 
                            + b +" is " + (a + b));
        System.out.println(str + " How are you?");
        System.out.println(str +" "+ str + " "+ str);
        System.out.println(str + " "+ 3 + " times");
        
        keyboard.close();
        
    }

}