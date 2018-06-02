public class Ticket
{
  private int ticketNumber;
  private Airline myAirline;
  private Passenger myPassenger;
  private Flight myFlight;
  private int price;
  private static int counter = 0;

  public Ticket(Airline myAirline, Passenger myPassenger, Flight myFlight)
  {
    counter++;
    this.myAirline = myAirline;
    this.myPassenger = myPassenger;
    this.myFlight = myFlight;
    ticketNumber += counter;
    price = getPrice(myFlight);
  }

  // Get Methods.
  public int getPrice(Flight myFlight)
  {
    int price = 100;
    if(myFlight.getSeats() <= 50)
      return price;
    else if(myFlight.getSeats() <= 60 &&  myFlight.getSeats() > 50)
      price += 25;
    else if(myFlight.getSeats() <= 70 && myFlight.getSeats() > 60)
      price += 30;
    else if(myFlight.getSeats() <= 80 && myFlight.getSeats() > 70)
      price += 35;
    else if(myFlight.getSeats() <= 90 && myFlight.getSeats() > 80)
      price += 40;
    else if(myFlight.getSeats() <= 100 && myFlight.getSeats() > 90)
      price += 45;
    else if(myFlight.getSeats() <= 110 && myFlight.getSeats() > 100)
      price += 50;
    else
      price += 70;
    return price;

  }
  public int getTicketNumbers()
  {
    return ticketNumber;
  }
  public Airline getMyAriline()
  {
    return myAirline;
  }
  public Passenger getMyPassenger()
  {
    return myPassenger;
  }
  public Flight getMyFilight()
  {
    return myFlight;
  }
  public int getCounter()
  {
    return counter;
  }
  //cancels the ticket.
  public void cancel()
  {
  }
  public String toString()
  {
    return myAirline + " Ticket Number: " + ticketNumber + " " + myFlight + " Cost " + price;
  }
}
