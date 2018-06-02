package airlines;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

//1.new airline object
		Airline AirName = new Airline();
		AirName.setName ("Air Queens");
		//System.out.println(AirName.getName());
		
		
//22222??????
//33333??????
		
//4. Ask user to create their passenger data
		//name input in correct form.
		Scanner kb1 = new Scanner(System.in);
		System.out.println("Ready to book your flights. Enter your first and last name please: ");
		String firstName = kb1.next();
		String lastName = kb1.next();
		
		Scanner kb2 = new Scanner(System.in);
		System.out.println("Type your address on one line please: ");
		String address = kb2.next();
		
		System.out.println("Type your phone number on one line please: ");
		Scanner phone = new Scanner(System.in);
		
		System.out.println("Ready to book your flights between Kennedy and Laguardia for October 2017");
		System.out.println("Do you want to book or cancel a flight? Answer Yes of No:");
		
		
		System.out.println("Enter C to cancel, K for a flight from Kennedy, or L for a flight from Laguardia");
		
		
		
		System.out.println("Enter the day in October that you want to fly: ");
		
		
		
		System.out.println("Enter an hour you would like to fly (in range 1 - 24)");
		
		
		System.out.println("Here are available flights: ");
		System.out.println("..................");
		
		
		
		kb.close();
		
		
	}

}
