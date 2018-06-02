import java.util.ArrayList;
public class Flight{
//instance variables
    private String flightNumbers;
    private int seats;
    private int filledSeats = 0;
    private double flightLength;
    private Airline airLine;
    private String date;
    private String originAirport;
    private String destination;
    private double departureTime;
    private ArrayList<Ticket> tickets; //= new ArrayList<Ticket>(); not yet, not here 
    private static int counter=0; //keep track of flight number.


//constructors
    public Flight(){
        //filledSeats = 0;
    }
    public Flight(Airline newAirline, double newDepartureTime, int newSeats, String newOriginAirport, String newDestination) {
    	this.seats = newSeats;
    	this.airLine = newAirline;
    	this.originAirport = newOriginAirport;
    	this.destination = newDestination;
    	this.departureTime = newDepartureTime;
    	tickets = new ArrayList<Ticket>();
    	counter++;
    }
//set & get methods
    public void setSeats(int newSeats) {
    	this.seats = newSeats;
    }
    public int getSeats() {
    	return seats;
    }
    public int getFilledSeats() {
        return filledSeats;
    }
    public void setDate(String d) {
    	this.date = d;
    }
    public String getDate() {
    	return date;
    }
    public void setAirline(Airline newAirline) {
    	this.airLine = newAirline;
    }
	
	public Airline getAirline() {
		return airLine;
	}
	public void setFlightNumber(String string) {
		this.flightNumbers = string;
	}
	public String getFlightNumber() {
		return flightNumbers;
	}
	public void setOriginAirport(String newOriginAirport) {
		this.originAirport = newOriginAirport;
	}
	public String getOriginAirport() {
		return originAirport;
	}
	public void setDestination(String newDestination) {
		this.destination = newDestination;
	}
	public String getDestination() {
		return destination;
	}
	// public void setDepartureTime(double dT) {this.departureTime = dT;}
    public double getDepartureTime() {
		return departureTime;
    }
     public void setFlightLength(double newLenght) {
		 this.flightLength = newLenght;
	 }
	 public double getFlightLength() {
		 return flightLength;
	 }
	 public void setTicket(ArrayList<Ticket> newtickets) {
		 this.tickets = newtickets;
	 }
	 public ArrayList<Ticket> getTickets(){
		 return tickets;
	 }

//methods
    public double getCost(){
        //use flight's airline method to generate the cost of next ticket for this flight.
        return airLine.cost(this);
    }
  /*  
    public boolean matches(String d, double t, String from){
        //does flight match date d, time t, originAirport from to within 4 hr depart window.
    	if( ){
            
    //   }
    return null;
    }
  */  
    
    public boolean hasSpace(){
        //any empty  seats available
    	if(seats-counter==0 ) {
    		return true; //there still space
        }
        return false;
    }
    public void addTicket(Ticket t){
        //add a newly issued ticket to the flight
    	
    }
   
  /*
    public boolean holdsTicket(Ticket tickets){
        //does the flight already hold a particular ticket?
    //	if( ) {
    //		return true;
    //	}
    //	return false;
    }
  */
	
    public void remove(Ticket ticket){
        //remove a canceled ticket from flight.
    	
    }
	
	public String toString(){
		return airLine.toString() + "\nflightNumbers: "+flightNumbers + " Date: " + date + " " + departureTime + " From: "  + originAirport + " To: " + destination + " TicketCost: " + Airline.cost(this);
	}
	
}