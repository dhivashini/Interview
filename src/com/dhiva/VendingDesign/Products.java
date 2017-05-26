package com.dhiva.VendingDesign;

public enum Products {
	CANDY("Candy", 10), SNACK("Snack", 50), NUTS("Nuts", 90), SODA("Soda", 45);

	private String name;
	private int price;

	private Products(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getProductName() {
		return name;
	}

	public int getProductPrice() {
		return price;
	}
}
