package airlines;

public class Airline {
	private String name;
	//private ArrayList<Flight> flights;
	//constractor
	//getter & setter for Air name
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name = n;
	}
	
	
	public void cancel(Ticket t){
		
	}
	
	public void issueRefund(Ticket t){
		
	}
	
	public ArrayList<Flight> findFlights(String date, double time, String origin){
		
	}
	
	public Ticket book(Passenger p, Flight f){
		
	}
	
	public double cost(Flight f){
		
	}
}
