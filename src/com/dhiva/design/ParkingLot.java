package com.dhiva.design;

import java.util.ArrayList;

public class ParkingLot {
	private ArrayList<ParkingLevel> levels;
	private ArrayList<User> users;
	private TicketValidationMachine ticketMachine;
	private Sensor sensor;
	private String sizeRequired;


	public ParkingLot(int size) {
		levels = new ArrayList<ParkingLevel>(size);
	}
	
	public void findSpot(User user){
		this.sizeRequired = user.getSizeRequired();
		for(ParkingLevel current: levels){
			if(current.getAvailableSpotCount()!=0){
				int s = current.getSuitableSpot(sizeRequired);	
				ParkingSpot spot = current.getSpot(s);
				spot.parkCar();
			}
		}
		
	}
	
	
}
