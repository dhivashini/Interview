package com.dhiva.ElevatorDesign;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements ElevatorInterface {
	private ElevatorState state;
	private int capacity;
	private int currentFloor;
	private Queue<Integer> queue ;
	
	public Elevator(int currentFloor) {
		this.currentFloor = currentFloor;
		this.queue = new LinkedList<Integer>();
	}
	
	public int getCapacity(){
		return this.capacity;
	}


	@Override
	public void moveUp() {
		currentFloor++;
	}


	@Override
	public void moveDown() {
		currentFloor--;
	}

	
	@Override
	public ElevatorState state() {
		//check the currentfloor and the destination to decide whoch direction its moving to.
		return null;
	}
	
	public void addDestination(Integer floor){
		this.queue.add(floor);
	}
	
	public int nextDestination(){
		return queue.peek();
	}
	
	public void popDestination(){
		this.queue.poll();
	}
	
	
}

