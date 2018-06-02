import java.util.Scanner;

// Class 2 input example, including variables and arithmetic
public class NameAndAge {   
    // camel case: 
                            
    // initial capital for 2nd and later word is Java convention

	public static void main(String args[]) {
		String name;
        int age;       
        // primitive types include int, double, char, boolean
        Scanner terminal = new Scanner(System.in);  
        // Scanner is a class type like String                                           
        // see Chapter 6, it is used for input      
        // the variable terminal has type Scanner
        
        System.out.print("Name and age: ");
        name = terminal.next();                    
        // Scanner method next gets the next String of input
        age = terminal.nextInt();                   
        //    gets the next integer from input
		
		int ageInSeconds = age * 365 * 24 * 60 * 60;
		System.out.println("Hello " + name + " you are " +
				ageInSeconds + " seconds old.");
		terminal.close();
		
	}
}