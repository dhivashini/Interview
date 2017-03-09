package com.dhiva.design;

public class ParkingSpot {
	private int spotNumber;
    private int area;
    //Assuming only one type of parking spot
    private SpotType type;
    private boolean available = true;
    
    public void setType(SpotType type){
    	this.type = type;
    }
    
    public String getType(){
    	return type.toString();
    }
    
    public void parkCar(){
        this.available = false;
    }
    
    public void unparkCar(){
        this.available = true;
    }
    
    public boolean getAvailability(){
         return this.available;
    }
    
    public int getArea(){
        return this.area;
    }
}
