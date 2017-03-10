package com.dhiva.ElevatorDesign;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ElevatorSystem {
	private ArrayList<Elevator> elevator;
	private int floors;
	private Queue<Integer> requests;
	
	
	public ElevatorSystem(int number,int floor) {
		this.elevator = new ArrayList<Elevator>(number);
		this.floors = floor;
		this.requests = new LinkedList<Integer>();
		initializeElevators();
	}


	private void initializeElevators() {
		// TODO Auto-generated method stub
		//initialize elevators
	}
	
	public void pickup(Integer floor){
		requests.add(floor);
	}
	
	public void schedule(){
		
	}
	
}
