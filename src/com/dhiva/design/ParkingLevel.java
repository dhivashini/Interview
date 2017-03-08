package com.dhiva.design;

import java.util.ArrayList;
import java.util.Iterator;

public class ParkingLevel {
	private ArrayList<ParkingSpot> parkingSpots;
	
	public ParkingLevel(int count) {
		this.parkingSpots = new ArrayList<ParkingSpot>(count);
	}
	
	 public int getAvailableSpotCount(){
	        int count = 0;
	        Iterator<ParkingSpot> i = parkingSpots.iterator();
	        while(i.hasNext()){
	            if(i.next().getAvailability()==true)
	                count++;
	        }
	        return count;
	    }
	
}
