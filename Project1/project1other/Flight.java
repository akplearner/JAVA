import java.util.ArrayList;

public class Flight {

    private Airline airline;
    private String flightNumber, date, originAirport, destination;
    private int seats, filledSeats;
    private double departureTime, flightLength;
    private ArrayList<Ticket> tickets;
    public static int counter = 0;

    public Flight(Airline airline, double departureTime, int seats, String originAirport, String destination) {
        this.airline = airline;
        this.seats = seats;
        this.departureTime = departureTime;
        this.originAirport = originAirport;
        this.destination = destination;
        tickets = new ArrayList<>();
        counter++;
    }

    boolean matches(String d, double t, String from){
        if(date == d && originAirport == from){
            if(Math.abs(departureTime - t)<=4.0){
                return true;
            }
        }
        return false;
    }

    boolean hasSpace(){
        if(filledSeats >= seats) return false;
        return true;
    }

    void addTicket(Ticket t){
        tickets.add(t);
        filledSeats++;
    }

    boolean holdsTicket(Ticket t){
        if(tickets.contains(t)) return true;
        return false;
    }

    void remove(Ticket t){
        tickets.remove(t);
        filledSeats--;
    }

    public double getCost(){
        return airline.cost(this);
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFilledSeats() {
        return filledSeats;
    }

    public double getFlightLength() {
        return flightLength;
    }

    public void setFlightLength(double flightLength) {
        this.flightLength = flightLength;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline.getName() + '\'' +
                ", date='" + date + '\'' +
                ", originAirport='" + originAirport + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", seats=" + seats +
                ", filledSeats=" + filledSeats +
                ", flightLength=" + flightLength +
                ", tickets=" + tickets +
                "}\n";
    }
}
