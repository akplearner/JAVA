public class Ticket {

    private Airline myAirline;
    private Passenger myPassenger;
    private Flight myFlight;
    private int ticketNumber;
    private double price;
    public static int counter = 0;

    public Ticket(Airline myAirline, Passenger myPassenger, Flight myFlight, double price) {
        this.myAirline = myAirline;
        this.myPassenger = myPassenger;
        this.myFlight = myFlight;
        this.price = price;
        counter++;
        ticketNumber = counter;
    }


    public void cancel(){
        myAirline.cancel(this);
        myPassenger.cancel(this);
        myFlight.remove(this);
        counter--;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public Airline getMyAirline() {
        return myAirline;
    }

    public void setMyAirline(Airline myAirline) {
        this.myAirline = myAirline;
    }

    public Passenger getMyPassenger() {
        return myPassenger;
    }

    public void setMyPassenger(Passenger myPassenger) {
        this.myPassenger = myPassenger;
    }

    public Flight getMyFlight() {
        return myFlight;
    }

    public void setMyFlight(Flight myFlight) {
        this.myFlight = myFlight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "myAirline='" + myAirline.getName() + '\'' +
                ", myPassenger='" + myPassenger.getLastName() + '\'' +
                ", myFlight='" + myFlight.getFlightNumber() + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", price=" + price +
                '}';
    }
}
