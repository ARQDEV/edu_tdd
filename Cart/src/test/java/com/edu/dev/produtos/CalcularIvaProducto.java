package com.edu.dev.produtos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.edu.dev.producto.Producto;

class CalcularIvaProducto {

	@Test
	void calcularIvaProducto() {

		Producto tenis = new Producto();
		tenis.setCodigo("T123");
		tenis.setPrecio(new BigDecimal(150000));
		
		assertEquals(150000+Producto.IVA19, tenis.getPrecio().add(BigDecimal.valueOf(Producto.IVA19)));
	}

}
