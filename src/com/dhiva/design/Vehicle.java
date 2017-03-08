package com.dhiva.design;

public class Vehicle {
	private String type;
	protected int spotsRequired;
	protected VehicleSize size;

	public int getSpotsNeeded() {
		return spotsRequired;
	}

	public VehicleSize getSize() {
		return size;
	}

}
