import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Main{
//instance variables 
	static int numSeats = 100;

//MAIN
	public static void main(String[] args){
		//create new airlines objects
    	Airline airline = new Airline("Air Queens");
		//1. method randomly generate flights for month oct 2017
		generateFlight(airline);		
		//2. mehod generate 1000 randow passengers who books one flight
		generatePassengers(airline);
			//System.out.println("["+airline.toString()+"]");
		//3.method ask user create their passanger data
			//System.out.println("Pasenger: "+ p.toString());
		Scanner Input = new Scanner(System.in);
		System.out.println("Ready to book your flights. Enter your first and last name please: ");
			String firstName = Input.nextLine();
			String lastName = Input.nextLine();
		System.out.println("Type your address on one line please: ");
			String address = Input.nextLine();
		System.out.println("Type your phone number on one line please: ");
			String phone = Input.nextLine();
		//4. method run loop of user iteration to allow user to book or cancel ticket
		System.out.println("Ready to book your flights between Kennedy and Laguardia for October 2017");
		while(true){
			System.out.println("Do you want to book or cancel a flight? Answer Yes of No:");
			String s1 = Input.nextLine();
			if(s1.equals("no")){ 
				System.out.println("you answer was no");
				break;
			}
			if(s1.equals("yes")){ System.out.println("you answer was yes");}
			} 
			if( !((s1.equals("no")) )) ){
			System.out.println("You entered an unacceptable answer. Please try again.");
			}
		Passenger p = new Passenger(firstName,lastName, address, phone);
		System.out.println("Thank you for booking with Air Queens Here is a list of your bookings: ");
		airline.toString();
		/*
		s
			System.out.println("Do you want to book or cancel a flight? Answer Yes of No:");			
			System.out.println("Enter C to cancel, K for a flight from Kennedy, or L for a flight from Laguardia");
			System.out.println("Wrong input please try again.");
			repeatQuestion = false;
		
		*/
		//5. method when finish print list of users booked tickets
		Input.close();
	}
    
//Methods
	//1st
    private static void generateFlight(Airline airline) {
		//generate each day from 6am till 10pm
    	for(int timeHr= 6; timeHr<22; timeHr++) {
    		airline.createFlight(timeHr, numSeats,"Laguardia","Kennedy");
    		airline.createFlight(timeHr, numSeats,"Kennedy","Laguardia");
    	}
	}

    //2nd
	private static void generatePassengers(Airline airline) {
     
	}

	//3rd
	public static Passenger passengerQ() {
		Scanner Input = new Scanner(System.in);
		System.out.println("Ready to book your flights. Enter your first and last name please: ");
			String firstName = Input.nextLine();
			String lastName = Input.nextLine();
		System.out.println("Type your address on one line please: ");
			String address = Input.nextLine();
		System.out.println("Type your phone number on one line please: ");
			String phone = Input.nextLine();
        Input.close();
        return new Passenger(firstName, lastName, address, phone);
	}
	
	
	//4th
//	private static Passenger interactions(Passenger p, Airline airline){		
//		return p;
//	}
	
	/*private static int randInt(int min, int max) {
		int n;
		return n; 
    }
    private static Flight searchFlight(Airline airline) {
		Flight foundFlight ;
		return foundFlight.findFli
	}
	*/
    
}