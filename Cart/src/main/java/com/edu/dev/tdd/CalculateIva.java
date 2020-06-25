package com.edu.dev.tdd;

import java.util.ArrayList;
import java.util.List;

public class CalculateIva {

	private static final double IVA = 1.19;
	private List<Product> productsList = new ArrayList<>();

	public CalculateIva(List<Product> productsList) {
		this.productsList = productsList;
	}

	public Double getFinalPrice() {

		Double finalPrice = 0D;

		for (Product product : productsList) {
			if (product.isChargeIva()) {
				product.setPrice((double) Math.round(product.getPrice() * IVA));
			}
			finalPrice += product.getPrice();
		}
		return finalPrice;
	}

}