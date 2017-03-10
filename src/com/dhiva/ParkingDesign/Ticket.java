package com.dhiva.ParkingDesign;

public class Ticket {
	private float timeIn;
	private String type;

	public void setTime(float time) {
		timeIn = time;
	}

	public float getTime() {
		return timeIn;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type.toString();
	}
}
