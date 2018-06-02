import java.util.ArrayList;
public class Ticket{
//instance variables
    private int ticketNumber;
    private Airline myAirline;
    private Passenger myPassenger;
    private Flight myFlight;
    private double price;
    private static int counter = 0;//stores int as it increase with new ticket issued.
//constructors
    public Ticket(Airline newMyAirline, Passenger newMyPassenger, Flight newMyFlight,double newPrice){
        // should not have ticketNumber parameter bc its autamatically gen by static field counter.
    	this.myAirline = newMyAirline;
    	this.myPassenger = newMyPassenger;
    	this.myFlight = newMyFlight;
    	this.price = newPrice;
    	counter++;
    	ticketNumber = counter;
    }
   
   //get and sets
    public int getTicketNumber(){ return ticketNumber;}
    public void setMyAirline(Airline newMyAirline){ this.myAirline = newMyAirline;}
    public Airline getMyAirline(){ return myAirline;}
    public void setMyPassenger(Passenger newMyPassenger) {this.myPassenger = newMyPassenger;}
    public Passenger getMyPassenger(){return myPassenger;}
    public void setMyFlight(Flight newMyFlight) {this.myFlight = newMyFlight;}
    public void setPrice(double newPrice) {this.price = newPrice;}
    public double getPrice() {return price;}
    
//methods
    public double getPrice(Flight myFlight)
    {
    int newPrice = 100;
    if(myFlight.getSeats() <= 50)
        return newPrice ;
    else if(myFlight.getSeats() <= 60 &&  myFlight.getSeats() > 50)
        newPrice  += 25;
    else if(myFlight.getSeats() <= 70 && myFlight.getSeats() > 60)
        newPrice  += 30;
    else if(myFlight.getSeats() <= 80 && myFlight.getSeats() > 70)
        newPrice  += 35;
    else if(myFlight.getSeats() <= 90 && myFlight.getSeats() > 80)
        newPrice  += 40;
    else if(myFlight.getSeats() <= 100 && myFlight.getSeats() > 90)
        newPrice  += 45;
    else if(myFlight.getSeats() <= 110 && myFlight.getSeats() > 100)
        newPrice  += 50;
    else
        newPrice  += 70;
    this.price = newPrice ;
    return price;

    }
    public void cancel(Ticket t) {
        //cancel airline,passenger and flight for this ticket
        myAirline.cancel(this);
        myPassenger.cancel(this);
        myFlight.remove(this);
        counter--;
    }
    
    public String toString(){ 
        return   myFlight.toString()+"\n TicketNumber: "+ticketNumber
                                    +" myAirline: "+" myAirline: "
                                    +" myAirline: "+myAirline
                                    +" myPassenger "+myPassenger
                                    +" myFlight: "+myFlight
                                    +" price: "+price+" counter: "
                                    +counter;
    }

	public boolean contains(Ticket tickets) {
		// TODO Auto-generated method stub
		return false;
	}
}