import java.util.ArrayList;

public class Passenger {

    private String firstName, lastName, address, phone;
    private ArrayList<Ticket> myTickets;

    public Passenger(String firstName, String lastName, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        myTickets = new ArrayList<>();
    }

    public void cancel(Ticket t){
        myTickets.remove(t);
    }

    public ArrayList<Flight> findFlights(Airline a, String date, double time, String from){
        ArrayList<Flight> flights = a.getFlights(), foundFlights = new ArrayList<>();

        for(Flight current: flights){
            if(current.getDate().equals(date)){
                if(Math.abs(current.getDepartureTime()-time) <= 4.00) foundFlights.add(current);
            }
        }

        return foundFlights;
    }

    public Ticket bookFlight(Flight f){
        Airline airline = f.getAirline();
        Ticket t = airline.book(this, f);
        myTickets.add(t);
        return t;
    }

    boolean holdsTicket(Ticket t){
        return myTickets.contains(t);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Ticket> getMyTickets() {
        return myTickets;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMyTickets(ArrayList<Ticket> myTicets) {
        this.myTickets = myTicets;
    }

    @Override
    public String toString() {
        return "Passenger:\n" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", \nmyTickets=" + myTickets +
                '}';
    }
}
