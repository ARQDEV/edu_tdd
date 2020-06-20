package com.edu.dev.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/*
 * Se hace refactor para que se contruya un Product con un Builder y Chaining
 * debido a que los parametros valiosos son el precio y grava o no IVA. 
 */

class CalculateIvaProductsTest3 {

	private Product mango;
	private Product flores;
	private CalculateIva calculateIva;
	private List<Product> products;

	@Test
	void calculateIvaProducts() {

		mango = new ProductsBuilder().setPrice(3500D, false).build();
		flores = new ProductsBuilder().setPrice(4000D, true).build();

		products = new ArrayList<Product>();
		products.add(mango);
		products.add(flores);

		calculateIva = new CalculateIva(products);
		assertEquals(8260D, calculateIva.getFinalPrice());

	}

	final class ProductsBuilder {

		private Double id;
		private String name;
		private Double price;
		private boolean chargeIva;

		public ProductsBuilder() {
			this.id = Math.random();
			this.name = "Some product";
		}

		public ProductsBuilder setPrice(Double price, boolean chargeIva) {
			this.chargeIva = chargeIva;
			this.price = price;
			return this;
		}

		public Product build() {
			return new Product(id, name, price, chargeIva);
		}

	}

}
