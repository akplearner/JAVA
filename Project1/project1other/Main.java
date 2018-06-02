import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int seats = 100;
    public static void main(String[] args) {

        Airline airline = new Airline("QC");

        generateFlight(airline);
        //System.out.println(airline);

        generatePassengers(airline);
        System.out.println(airline);

        Passenger p = askUser();
        System.out.println(p);

        System.out.println(interactions(p, airline));
    }

    private static Passenger askUser() {
        Scanner reader = new Scanner(System.in);
        String fName, lName, address, phone;
        System.out.println("Enter First Name: ");
        fName = reader.nextLine();
        System.out.println("Enter Last Name: ");
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
        while(!quit){
            System.out.println("Choose: \n" + "1. Quit \n" + "2. Book a Flight\n" + "3. Cancel Ticket\n");
            int choice = reader.nextInt();
            if(choice == 1) {
                quit = true;
            }
            else if(choice == 2){
                p.bookFlight(searchFlight(airline)); //ask user flight info and books it.
                System.out.println("Success");
                continue;
            }
            else if(choice == 3){

                ArrayList<Ticket> myTickets = p.getMyTickets();
                if(myTickets.size()==0) {
                    System.out.println("You do not have any purchased tickets");
                    continue;
                }
                System.out.println("Choose: ");
                for(int i=0; i<myTickets.size(); i++){
                    System.out.println( i + ". " + myTickets.get(i));
                }
                int tnum = reader.nextInt();
                p.cancel(myTickets.get(tnum));
                System.out.println("Success");
                continue;
            }
            else {
                System.out.println("Enter valid choice: ");
            }
        }
        return p;
    }

    private static Flight searchFlight(Airline airline) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Date: (08/1/2017 - 08/30/2017)");
        String date = reader.nextLine();
        System.out.println("Enter origin city: (NYC or Seattle)");
        String origin = reader.nextLine();
        System.out.println("Enter Time(24 hr format): (6.00 - 21.00)");
        Double time = reader.nextDouble();


        ArrayList<Flight> foundFlights = airline.findFlights(date, time, origin); //returns arrays of various flights according to info parameters
        System.out.println("Search Results: ");
        for (int i= 0; i<foundFlights.size(); i++){
            System.out.println( i + ". " + foundFlights.get(i));
        }
        System.out.println("Choose: ");
        int choice = reader.nextInt();
        return foundFlights.get(choice); //returns specific flight object.
    };

    private static void generateFlight(Airline airline) {
        for (int i=6; i<22; i++){
            airline.createFlight( i, seats, "NYC", "Seattle");
            airline.createFlight(i, seats, "Seattle", "NYC");
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
