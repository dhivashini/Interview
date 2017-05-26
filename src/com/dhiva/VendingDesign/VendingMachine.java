package com.dhiva.VendingDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
You need to design a Vending Machine which follows following requirements:
Accepts coins of 1,5,10,25, 50 Cents i.e. penny, nickel, dime, and quarter as well as 1 and 2 dollar note
Allow user to select products e.g. CANDY(10), SNACK(50), NUTS(90), Coke(25), Pepsi(35), Soda(45)
Allow user to take refund by canceling the request.
Return selected product and remaining change if any
Allow reset operation for vending machine supplier
*/
public class VendingMachine {
	private Inventory<Coins> cash = new Inventory<Coins>(); 
	private Inventory<Products> items = new Inventory<Products>();   
	private Products currentItem; 
	private double currentBalance; 

	
	public VendingMachine(int count){
		//initialize with soem initial count for each product

	}
	
	Products selectProduct() {
		return currentItem;

	}

	public void cancelRequest() {
		refund();
	}

	private void refund() {
		// TODO Auto-generated method stub

	}
	
	public void insertCoin(Coins c){
		
	}

	private List<Coins> resetMachine() {

	}
	
	public HashMap<Products,List<Coins>> getProductAndChange(){
		
	}
	

}
