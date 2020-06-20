package com.edu.dev.tdd;

public class Product {

	private Double id;
	private String name;
	private Double price;
	private boolean chargeIva;

	public Product(Double id, String name, Double price, boolean chargeIva) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.chargeIva = chargeIva;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isChargeIva() {
		return chargeIva;
	}

}
