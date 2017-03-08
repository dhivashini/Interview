package com.dhiva.design;

import java.util.ArrayList;

public class ParkingLot {
	private ArrayList<ParkingLevel> levels;
	private User[] users;
	private TicketValidationMachine ticketMachine;
	private Sensor sensor;

	public ParkingLot(int size) {
		levels = new ArrayList<ParkingLevel>(size);
	}
}
