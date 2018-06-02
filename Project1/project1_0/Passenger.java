import java.util.ArrayList;
//Contains information about passenger.
public class Passenger{
//instance variables
    private String firstName;
    private String lastName;
    private String Address;
    private String Phone;
    //myTickets, is an array of all tickets booked by passenger.
    private ArrayList<Ticket> myTickets; //only declaring it but not creating (= new ArrayList();) yet.
//constructors
    public Passenger() {
    	this.firstName = "NONE";
        this.lastName = "NONE";
        this.Address = "NONE";
        this.Phone = "NONE";
        //myTickets = new ArrayList<>(); //creating new ticket object.
    }
    public Passenger(String firstN, String lastN, String address, String phone){
        this.firstName = firstN;
        this.lastName = lastN;
        this.Address = address;
        this.Phone = phone;
        myTickets = new ArrayList<>(); //creating new ticket object.
    }
//get and set methods
    // do not supply setNames
    public String getFirstName() { return firstName; }
    public String getLastname() { return lastName; }
    public void setAdress(String newAdress) { this.Address = newAdress; }
    public String getAddress() { return Address;}
    public void setPhone(String newPhone) { Phone=newPhone;}
    public String getPhone() { return Phone;}
    public void setMyTickets(ArrayList<Ticket> newTicket) {this.myTickets = newTicket;}
    public ArrayList<Ticket> getMyTicket(){ return myTickets; }
//methods
   
    public ArrayList<Flight> findFlights (Airline flightName, String date, double time, String from) {
        //finds all flights for an airline on a particular date within 4 hours of a particular departure time from a particular city.
        return null;
    }
    
    public Ticket bookFlight(Flight f) { //f is specific flight object of flights using searchFlight(airline) method from main, returns the flight choice by user.
        //books a ticket for a particular flight (for the passenger).
    	return null;
    }
  /*
    public boolean holdsTicket(Ticket t) {
        //reports where the passenger holds a particular ticket            
    }
 */
    void cancel(Ticket t) {//
        //cancels the last ticket created
   
    }
    public String toString(){ 
    	//for testing 
    	return  " firstName= " + firstName + 
    			" lastName: " + lastName +
    			" Address= " + Address +
                " Phone= " + Phone ;
               // +" myTickets= "+ myTickets.toString();
    } 
}
