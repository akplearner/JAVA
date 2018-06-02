package cs212unit2;

import java.util.Random;

public class ParkedCar {

	static String makes[] = {"Toyota", "Honda", "Hyundai", "BMW", "Porsche", "Mazarati", "Ford", "Chevrolet"};
	static String models[] = {"Sedan", "Staion Wagon", "SUV", "Light Truck"};
	static String colors[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
	
	private String make;
	private String model;
	private String color;
	private String license;
	private ParkingMeter meter;
	
	public ParkedCar() {
		make = pickOne(makes);
		model = pickOne(models);
		color = pickOne(colors);
		license = generateLicense();
		meter = new ParkingMeter();
	}
	
	private String generateLicense() {
		Random x = new Random();
		String answer = "";
		for (int i = 0; i < 3; i++) 
			answer += (char) ('A' + x.nextInt(26));
		for (int i = 0; i < 4; i++) 
			answer += (char) ('0' + x.nextInt(10));
		return answer;
	}

	private String pickOne(String[] choices) {
		Random x = new Random();
		return choices[x.nextInt(choices.length)];
	}

	public boolean expiredMeter() {
		return meter.isExpired();
	}

	public void adjustMeter(int x) {
		meter.remove(x);
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getLicense() {
		return license;
	}

	public String toString() {
		return getColor() + " " + getMake() + " " + getModel() + 
				" License number: " + getLicense();
	}

	public String getFine() {
		return meter.getFine();
	}

}