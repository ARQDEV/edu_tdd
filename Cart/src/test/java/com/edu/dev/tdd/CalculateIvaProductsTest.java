package com.edu.dev.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CalculateIvaProductsTest {

	private Product mango;
	private Product flores;
	private CalculateIva calculateIva;
	private List<Product> products;

	@Test
	void calculateIvaProducts() {

		mango = new Product(1D, "Mango Tommy", 3500D, false);
		flores = new Product(2D, "Mango Tommy", 4000D, true);
		products = new ArrayList<Product>();
		products.add(mango);
		products.add(flores);

		calculateIva = new CalculateIva(products);
		assertEquals(8260D, calculateIva.getFinalPrice());

	}

}
