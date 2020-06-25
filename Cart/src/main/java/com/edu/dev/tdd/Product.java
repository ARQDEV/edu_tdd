package com.edu.dev.tdd;

public class Product {

	private Double id;
	private String name;
	private double price;
	private boolean chargeIva;

	public Product(double id, String name, Double price, boolean chargeIva) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.chargeIva = chargeIva;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isChargeIva() {
		return chargeIva;
	}

}
