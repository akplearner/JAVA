import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int seats = 100;
    static String location;
    public static void main(String[] args) {

        Airline airline = new Airline("Air Queens");

        generateFlight(airline);
        //System.out.println(airline);

        generatePassengers(airline);
        //System.out.println(airline);

        Passenger p = askUser();
        

        System.out.println(interactions(p, airline));
        System.out.println("Thank you for booking with "+airline.getName()+ "\nHere is a list of your bookings:");
        System.out.println(p);
    }

    private static Passenger askUser() {
        Scanner reader = new Scanner(System.in);
        String fName, lName, address, phone;
        System.out.println("Ready to book your flights. Enter your first and last name please: ");
        fName = reader.nextLine();
        lName = reader.nextLine();
        System.out.println("Address: ");
        address = reader.nextLine();
        System.out.println("Phone# : ");
        phone = reader.nextLine();
        return new Passenger(fName, lName, address, phone);
    }

    private static Passenger interactions(Passenger p, Airline airline){
        Scanner reader = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Ready to book your flights between Kennedy and Laguardia for October 2017");
        while(!quit){
            //Continue or quit
            System.out.println("Do you want to book or cancel a flight? Answer Yes of No:");
			String s1 = reader.nextLine();
            if(s1.equalsIgnoreCase("no")) {
                quit = true;
            }else if(s1.equalsIgnoreCase("yes")){
                //ask flight decisions
               
                while(!quit){
                    ArrayList<Ticket> myTickets = p.getMyTickets();
                    System.out.println("Enter C to cancel, K for a flight from Kennedy, or L for a flight from Laguardia");
                    String choice = reader.next();
                    if(choice.equalsIgnoreCase("no")) {
                        break;
                    }
                    if(choice.equalsIgnoreCase("c")){
                        do{
                            if(myTickets.size()==0) {
                                System.out.println("You do not have any purchased tickets");
                                break;
                            }
                            System.out.println("Here are the tickets you have booked: ");
                            for (int i= 0; i<myTickets.size(); i++){
                                System.out.println( i + " " + myTickets.get(i));
                            }
                            
                            System.out.println("Type the number of the ticket you wish to cancel:");
                            int tnum = reader.nextInt();
                            if(tnum>myTickets.size()-1){
                                System.out.println("Wrong input");
                                continue;
                            }
                            p.cancel(myTickets.get(tnum));
                            System.out.println("Success");
                            continue;
                        }while(!quit);
                        continue;
                    }
                    if(choice.equalsIgnoreCase("k")){
                        loc("k");
                        p.bookFlight(searchFlight(airline)); //ask user flight info and books it.
                        System.out.println("Successfully Booked ticket");
                        continue;
                    }
                    if(choice.equalsIgnoreCase("l")){
                        loc("l");
                        p.bookFlight(searchFlight(airline)); //ask user flight info and books it.
                        System.out.println("Successfully Booked ticket");
                        continue;
                    }else {
                        System.out.println("Enter valid choice: ");
                    }
                }
               
                p.bookFlight(searchFlight(airline)); //ask user flight info and books it.
                System.out.println("Success");
                continue;
            }
        }
        return p;
    }

    static String loc(String choice){
        if(choice.equalsIgnoreCase("k")){
            location = "Kennedy";
        }
        if(choice.equalsIgnoreCase("l")){
            location = "Laguardia";
        }
        return location;
    }

    private static Flight searchFlight(Airline airline) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Date: (08/1/2017 - 08/30/2017)");
        String date = reader.nextLine();
        String origin = location;
        System.out.println("Enter Time(24 hr format): (6.00 - 21.00)");
        Double time = reader.nextDouble();

        ArrayList<Flight> foundFlights = airline.findFlights(date, time, origin); //returns arrays of various flights according to info parameters
        System.out.println("Search Results: ");
        if(foundFlights.size()==0){
            System.out.println("No results");
            return null;
        }
        for (int i= 0; i<foundFlights.size(); i++){
            System.out.println( i + ". " + foundFlights.get(i));
        }
        
        System.out.println("Choose: ");
        int choice = reader.nextInt();
        return foundFlights.get(choice); //returns specific flight object.
    }

    private static void generateFlight(Airline airline) {
        for (int i=6; i<22; i++){
            airline.createFlight( i, seats, "Kennedy", "Laguardia");
            airline.createFlight(i, seats, "Laguardia", "Kennedy");
        }

        ArrayList<Flight> flights = airline.getFlights();
        int i = 0;
        int fNum = i;
        for(Flight f : flights){
            if(i%30==0) fNum = i/30;
            f.setFlightNumber(airline.getName() + fNum);
            i++;
        }
    }

    private static void generatePassengers(Airline airline) {
        ArrayList<Flight> flights = airline.getFlights();
        int counter = 0;
        for(int i=1; i<=1000; i++){
            String fName = "PFN" + i, lName = "PLN" + i;
            String address = Integer.toString(randInt(1000, 9999)) + " St";
            String phone = Integer.toString(randInt(100000000, 999999999));
            Passenger passenger = new Passenger(fName, lName, address, phone);
            passenger.bookFlight(flights.get(counter));

            if(counter<flights.size()-1)counter++;
            else counter = 0;
        }
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
