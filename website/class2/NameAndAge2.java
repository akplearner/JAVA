import java.util.Scanner;

//Class 2 with conversion of String (input) to numerical type

public class NameAndAge2 {
	
	public static void main(String args[]) {
		String name, age;
		int ageYears, ageSeconds;      
		Scanner terminal = new Scanner(System.in);  
		System.out.print("Name and age: ");
		name = terminal.next();                     
		age = terminal.next(); 
        ageYears = Integer.parseInt(age);  
        // Integer.parseInt() is a function to convert                                
        // String to int, similarly Double.parseDouble() 
        
		ageSeconds = ageYears * 365 * 24 * 60 * 60;
		System.out.println("Hello " + name + " you are " +
				ageSeconds + " seconds old.");
		terminal.close();
		
	}
}