package com.edu.dev.tdd;

import java.util.ArrayList;
import java.util.List;

public class CalculateIva {

	private static final Double IVA = 1.19;
	private List<Product> productsList = new ArrayList<>();

	public CalculateIva(List<Product> productsList) {
		this.productsList = productsList;
	}

	public Double getFinalPrice() {

		Double finalPrice = 0D;

		for (Product product : productsList) {
			if (product.isChargeIva()) {
				Double priceIva = (double) Math.round(product.getPrice() * IVA);
				product.setPrice(priceIva);
			}
			finalPrice += product.getPrice();
		}
		return finalPrice;
	}

}