import java.util.ArrayList;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.String;


public class Airline
{
  private String  name;
  private ArrayList<Flight> flights = new ArrayList<Flight>();

  public Airline(String name)
  {
    this.name = name;
    genertateRandomFlights();
  }
  public String getName()
  {
    return name;
  }

  public Flight getRanFlights()
  {
    Random rn = new Random();
    return flights.get(rn.nextInt(flights.size()));
  }
  //cancels a ticket.
  public void cancel()
  {
  }
  /*issues a refund --- it just prints a message about which passenger has been credited
  how much money since in this simulation we will not keep track of bank balances for passengers or airlines.*/
  public void issueRefund(Ticket t)
  {
  }
  //finds all flights for a 4 hour departure window
  public ArrayList<Flight> findFlights(String date, String origin, String to)
  {
    ArrayList<Flight> matchedFlights = new ArrayList<>();
    for(int i = 0; i < flights.size(); i++)
    {
    if( date.equals( flights.get(i).getDate()) &&   origin.equals(flights.get(i).getOriginAirport()) &&  to.equals(flights.get(i).getDestination()));
    
       matchedFlights.add(flights.get(i));

      }
    return matchedFlights;
  }
  //books a passenger on a flight
/*  public Ticket book(Passenger p, Flight f)
  {
  }*/
  /*gives the cost of a ticket for a particular flight.  Devise you own sensible pricing
  policy so that tickets get more expensive as a flight fills up*/
/*  public double cost(Flight f)
  {

  }*/
  /*creates a new flight for the Airline and makes sure that this flight operates
  every day*/

  public void createFlight(double time, int numSeats, String from, String to)
  {

  }
  // This method will generate random flights for the month of August and store it in an Arraylistls "flights"
  public void genertateRandomFlights()
  {
    String[] cities = { "New York", "Los Angeles", "Chicago","Houston",
    "Philadelphia", "Phoenix", "San Antonio", "San Diego", "Dallas",
    "San Jose", "Austin", "San Francisco", "Las Vegas", "Atlanta", "Miami", "Newark" };

    Random r = new Random();
    DecimalFormat df = new DecimalFormat("0.00");
    int flightNum = 1;
    String citieA, citieB;
    double dTime = 1;
    int seats = 50;
    double randomD;
    for(int i = 0; i < 23; i++)
    {
      for(int j = 0; j < 3; j++)
      {

        int d = 801;
        randomD = ThreadLocalRandom.current().nextDouble(.0,.40);
        dTime += randomD;
        citieA = cities[r.nextInt(cities.length)];
        citieB = cities[r.nextInt(cities.length)];
        while( d < 831)
        {
          String date = "17";
          date = d + date;
          date = date.substring(0,1) + "." + date.substring(1,3) +"." + date.substring(3,date.length());

          flights.add( new Flight(flightNum, seats, name, date ,citieA, citieB, df.format(dTime) ) ); // creates a fligt from A to B.
          flights.add( new Flight( flightNum, seats, name, date, citieB, citieA, df.format(dTime + .10)) );// Creates a flight from B to A, 10 mins apart
          d++;
        }

        dTime -= randomD;// Delete the mins and keep the hour.
      }
      dTime++;
      seats += 4;// Add 4 seats each hour
      flightNum++;
    }


  }
  public String toString()
  {
    return "Airline: " + name;
  }
}
