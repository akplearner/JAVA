import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Flight> flights;

    public Airline(String name) {
        this.name = name;
        flights = new ArrayList<>();
    }

    public void cancel(Ticket t){
        t.cancel();
    }

    public void issueRefund(Ticket t){
        System.out.println("Refund issued to " + t.getMyPassenger() + " of the amount " + t.getPrice());
    }

    public ArrayList<Flight> findFlights(String date, double time, String origin){

        ArrayList<Flight> foundFlights = new ArrayList<>();
        for(Flight current: flights){
            if(current.getDate().equals(date) && current.getOriginAirport().equalsIgnoreCase(origin)){
                if(Math.abs(current.getDepartureTime()-time) <= 4.00) foundFlights.add(current);
            }
        }

        return foundFlights;
    }

    public Ticket book(Passenger p, Flight f){
        Ticket t = new Ticket(this, p, f, this.cost(f));
        f.addTicket(t);
        return t;
    }

    public double cost(Flight f){
        int base = 300;
        return base + f.getFilledSeats() * 3;
    }

    public void createFlight(double time, int numSeats, String from, String to){

        for(int i=1; i<31; i++){
            Flight newFlight = new Flight(this, time, numSeats, from, to);
            newFlight.setFlightLength(3.5);
            newFlight.setDate("08/"+i + "/2017");
            flights.add(newFlight);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + flights +
                '}';
    }
}
