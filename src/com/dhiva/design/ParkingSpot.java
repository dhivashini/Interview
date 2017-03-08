package com.dhiva.design;

public class ParkingSpot {
	public int spotNumber;
    private int area;
    //Assuming only one type of parking spot
    private String type;
    private boolean available = true;
    
    public void setType(String type){
    	this.type = type;
    }
    
    public String getType(){
    	return this.type;
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
