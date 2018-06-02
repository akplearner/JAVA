package cs212unit2;

import java.util.ArrayList;
import java.util.Random;

// Simulate parked cars on a busy Street over a 24 hour period
public class ParkingSimulation {
	
	public static void main(String args[]) {
		ArrayList tickets = new ArrayList();
		ParkedCar street[] = new ParkedCar[20];  // the street has 20 parking spaces
		for (int i = 0; i < 20; i++) street[i] = null;  // initially empty
		Random x = new Random();
		
		for (int hour = 0; hour < 24; hour++) {  // simulation runs for 24 hours
			PoliceOfficer pol = null;
			// Every 5 minutes there is a chance of 0.05 that a police office checks parked cars
			//                 and a chance of 0.09 that any parked car is driven away
			//                 and a chance of 0.2 that any empty space is filled
			for (int minutes = 0; minutes < 60; minutes += 5) {
				if (x.nextInt(100) >= 95)
					pol = new PoliceOfficer();
				else pol = null;
				for (int i = 0; i < 20; i++) {
					int dice = x.nextInt(100);
					if (street[i] == null) {     // empty space, should it fill up? 
						if (dice >= 80) 
							street[i] = new ParkedCar();  // park a car and pay the meter
					}
					else {    // parked car, should it leave and should it be ticketed
						if (dice >= 91)
							street[i] = null;    // it left
						else {
							street[i].adjustMeter(5);  // take 5 minutes off the meter
							if (pol != null) {         // the police officer tries to ticket the car
								if (street[i].expiredMeter())
									tickets.add(pol.issueTicket(street[i]));
							}
						}
					}
				}
			}
		}
		
		// print an end of day summary of parking tickets
		System.out.println("Total number of parking tickets generated " + tickets.size());
		System.out.println("-----------------------------------------------");
		for (Object ticket:tickets)
			System.out.println(ticket);
	}
}
