package cs212unit2;

public class ParkingTicket {

	String officer = "Officer badge number: ";
	String car = "Parked Car information: ";
	String fine = "Fine ";
	
	public ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar) {
		officer += policeOfficer.getBadgeNumber();
		car += parkedCar.toString();
		fine += parkedCar.getFine();
	}

	public String toString() {
		return car + " " + fine + " " + officer;
	}
}
