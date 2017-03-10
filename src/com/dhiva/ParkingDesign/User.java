package com.dhiva.ParkingDesign;

public class User {
	private String name;
	private Vehicle vehicle;
	private String sizeRequired;

	public User(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getSizeRequired() {
		return this.sizeRequired;
	}

	public void setSizeRequired() {
		if (vehicle.size.toString().equals("compact")) {
			this.sizeRequired = "small";
		} else if (vehicle.size.toString().equals("large")) {
			this.sizeRequired = "large";
		} else {
			this.sizeRequired = "small";
		}
	}

}
