import java.util.ArrayList;
/** 
7 Contains information about flights for airline.
*/
public class Airline{
//instant variables
    private String name;
    private ArrayList<Flight> flights ;// initialize object flights

//constructors
    public Airline (){
        this.name = "NONE";
    }
    public Airline(String name){
        this.name = name;
        this.flights = new ArrayList<Flight>(); //creates a flight ArrayList object
    }
//get and set methods
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setFlights(ArrayList<Flight> newFlights) {
        this.flights = newFlights;
    }
    public ArrayList<Flight> getFlights() {
		return flights; //get info of object flights
	}
    
//methods
    //1.
	public void issueRefund(Ticket t){
		//prints which passenger has been credited how much money since simulation does not keep track		
	}
	
	//2.
	public ArrayList<Flight> findFlights(String date, double time, String origin){
        return null;
	}
	
	//3.
	public Ticket book(Passenger p, Flight f){
        //books passenger on a flight
        return null;
    }
	
	//4.
	public static double cost(Flight f){
        //gives cost of ticket for particular flight
        int base =200;
        //make tickets get more expensive  as flight fills up
        int newBase=f.getFilledSeats();
        return newBase;
    }
	
	//5/
    
    public void createFlight(double timeHr, int numSeats, String from, String to){
    	for(int dayMonth=1; dayMonth<=31; dayMonth++){
    		//creates new flight
    		Flight newFlight = new Flight(this, timeHr, numSeats, from, to);
            //make sure flight operates everyday.
            newFlight.setFlightLength(2.5);
            newFlight.setDate("08/"+dayMonth+"/2017");
            //newFlight.addTicket();
    	}
    }
    
    //6.
    public void cancel(Ticket t){
        //cancel a ticket	
    }
    
    //7.
    public String toString(){ //for testing
        return "name: "+name;
    }	
	
}