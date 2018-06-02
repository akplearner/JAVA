import java.util.ArrayList;

public class Flight
{
  private int    flightNumber;
  private int    seats;
  private int    filledSeats;
  private int    flightLength;
  private String airline;
  private String date;
  private String originAirport;
  private String destination;
  private String departureTime;
  private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
  private static int counter = 0;

  public Flight(int flightNumber, int seats, String airline, String date,
  String originAirport, String destination, String departureTime )
  {
    this.flightNumber = flightNumber;
    this.seats = seats;
    this.airline = airline;
    this.date = date;
    this.originAirport = originAirport;
    this.destination = destination;
    this.departureTime = departureTime;
    counter++;
  }
  public void populateFlight(Passenger p){

  }
  // Set Methods;
  public void setDate(String date)
  {
    this.date = date;
  }
  // Get Methods.
  public int getFlightNumber()
  {
    return flightNumber;
  }
  public int getSeats()
  {
    return seats;
  }
  public int getFilledSeats()
  {
    return filledSeats;
  }
  public String getArline()
  {
    return airline;
  }
  public String getDate()
  {
    return date;
  }
  public String getOriginAirport()
  {
    return originAirport;
  }
  public String getDestination()
  {
    return destination;
  }
  public String getDepartureTime()
  {
    return departureTime;
  }
  public ArrayList<Ticket> getTickets()
  {
    return tickets;
  }
  public static int getCounter()
  {
    return counter;
  }
  /*Does the flight match date d, time t and originAirport from
  to within a 4 hour departure window*/
  public boolean matches(String d, double t, String from)
  {
    return true;
  }
  //Are there any empty seats left?
  public boolean hasSpace()
  {
    return true;
  }
  // Add a newly issued ticket to the flight
  public void addTicket(Ticket t)
  {

  }
  // Does the flight already hold a particular ticket?
  public boolean holdsTicket(Ticket ticket)
  {
    return true;
  }
  // Remove a canceled ticket from the flight.
  public void remove(Ticket ticket)
  {

  }

  /* Use the flight’s airline’s method to generate the cost of the next ticket
  for this flight. */
  /*
  public double getCost()
  {

  }*/
  public String toString()
  {
    return "Flight Number: " + flightNumber + " From " + originAirport + " To: " + destination + "\nDate " + date + " Departure time: " + departureTime;
  }
}
