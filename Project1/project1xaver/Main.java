import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.String;
public class Main
{
  public static void main(String[] args)
  {
    String airlineName = "Not United Airlines";
    Scanner keyboard = new Scanner(System.in);
    Airline airline = new Airline(airlineName);
    ArrayList<Passenger> passengers = new ArrayList<>();
    ArrayList<Ticket> tempTicket;
    // Now we will create a passenger with the users input.
    String[] cities = { "New York", "Los Angeles", "Chicago","Houston",
    "Philadelphia", "Phoenix", "San Antonio", "San Diego", "Dallas", "San Jose", "Austin", "San Francisco", "Las Vegas", "Atlanta", "Miami", "Newark" };

    genRandPassengers(passengers); //
    bookRanTickets(passengers, airline); //


  for(int i = 0; i < passengers.size(); i++)
    {
      tempTicket = passengers.get(i).getMyTickets();
      // If not empty display passenger info.
      if(!tempTicket.isEmpty())
        System.out.print(passengers.get(i) + "\n");

      for(int j = 0; j < tempTicket.size(); j++)
      {
        System.out.println(tempTicket.get(j));
      }
      System.out.println();
    }
    System.out.println("The prevoius lines have booked tickets for 100 random passengers.");

    System.out.println("There is a bug here and I havent had time to find it for some reason when i find the matches for the flights the user is looking for is not working.");

    System.out.println("Welcome to " + airlineName + " Lets book a flight. " + "Enter your first and last name");
    String[] splitName = new String [2];
    String fullName;
    fullName = keyboard.nextLine();
    splitName = fullName.split(" ");

    System.out.println("Your address please."); // digits
    int address = keyboard.nextInt();
    System.out.println("Your phone number.");
    int phone = keyboard.nextInt();

    System.out.println("Pick a citie from the following list to fly to. Ener the numerical choice for it.");

    for(int i = 0; i < cities.length; i++)
    {
      System.out.print((i + 1 )+ " " + cities[i] + ", ");
    }
    String from = cities[0]; // Set as NY as default.
    String citieTo = cities[keyboard.nextInt() - 1];

    System.out.print("Enter the day you would like to book the flight: ");
    int date = keyboard.nextInt();


    passengers.add(new Passenger(splitName[0], splitName[1],address, phone));
    bookTicket(passengers, airline, from, citieTo, date);
  }
  // This method will look for mathces and book a ticket.
  public static void bookTicket(ArrayList<Passenger> pass, Airline air, String from, String citieTo, int d)
  {
    d += 800;
    String date = "17";
    date = d + date;
    date = date.substring(0,1) + "." + date.substring(1,3) +"." + date.substring(3,date.length());

    ArrayList<Flight> matchedFlights = new ArrayList<>();
    Passenger tempP = pass.get(pass.size() -1); // Access the last passengger.

    // Stored the matched flights.
    matchedFlights = air.findFlights(date, from, citieTo);
    System.out.println("The matched flights are size " + matchedFlights.size());
    for(int i = 0; i < matchedFlights.size(); i++)
      System.out.println(matchedFlights.get(i) + " ");

  }

  // This Method will book Tickets for passengers.
  public static void bookRanTickets(ArrayList<Passenger> pass, Airline air)
  {
      Passenger tempP;
      Flight tempF;
      Random rn = new Random();

      for(int i = 0; i < pass.size(); i++)
      {
        tempP = pass.get(rn.nextInt(pass.size()));
        tempF = air.getRanFlights();
        Ticket ticket = new Ticket(air, tempP, tempF);
        tempP.storeTicket(ticket);
      }
  }
  // Method will generate random passengers.
  public static void genRandPassengers(ArrayList<Passenger> p)
  {
    String[] fName =    { "Sophia","Jackson","Emma",
                         "Aiden","Olivia", "Lucas", "Ava",	"Liam",	"Mia", "Noah", "Isabella", "Ethan", "Riley", "Mason", "Aria", "Caden", "Zoe", "Oliver", "Elijah", "Charlotte", "Lily", "Grayson", "Layla", "Jacob", "Amelia", "Michael", "Emily", "Benjamin", "Madelyn", "Carter", "Aubrey", "James" };

    String[] lName = { "Smith", "Johnson", "Williams", "Jones",
	                     "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", 	"Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez" };

    String nameA, nameB;
    Random rn = new Random();
    int phone, address;
    for(int i = 0; i < 100; i++)
    {
      nameA = fName[rn.nextInt(fName.length)];
      nameB = lName[rn.nextInt(lName.length)];
      phone = rn.nextInt(999999) + 100000;
      address = rn.nextInt(9999) + 1000;
      p.add(new Passenger(nameA, nameB, address, phone));

    }
  }
}
