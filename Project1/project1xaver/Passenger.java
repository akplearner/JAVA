import java.util.ArrayList;

public class Passenger
{
  private String fName;
  private String lName;
  private int address;
  private int phone;
  private ArrayList<Ticket> myTickets = new ArrayList<>();

  public Passenger(String fName, String lName, int address, int phone)
  {
    this.fName = fName;
    this.lName = lName;
    this.address = address;
    this.phone = phone;
  }
  // Get Methods.
  public String getFName()
  {
    return fName;
  }
  public String getLname()
  {
    return lName;
  }
  public int getAddress()
  {
    return address;
  }
  public int getPhone()
  {
    return phone;
  }
  public ArrayList<Ticket> getMyTickets()
  {
    
    return myTickets;
  }
  // canels he passenger's ticket t.
  public void cancel(Ticket t)
  {

  }
  public void storeTicket(Ticket t)
  {
    myTickets.add(t);
  }
  //books a ticket for a particular flight (for the passenger)
  /*public Ticket bookFlight(Flight f)
  {
  }*/
  /*
  // finds all flights for an airline on a particular date //within 4 hours of a
  particular departure time from a particular city.*
  public ArrayList<Flight> findFlights(Airline a, String date, double time, String from)
  {

  }*/
  public boolean holdsTicket(Ticket t)
  {
    return true;
  }
  public String toString()
  {
    return "Passenger: " + fName + " "+ lName +
    "\nAddress: " + address + " Phone: " + phone;
  }
}
