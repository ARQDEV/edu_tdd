package com.edu.dev.produtos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edu.dev.producto.Producto;

class CalcularIvaProducto {

	@Test
	void calcularIvaProducto() {

		Producto tenis = new Producto();
		tenis.setCodigo("T123");
		tenis.setPrecio(150000D);
		
		assertEquals(150000+tenis.IVA19, tenis.getPrecio()+ tenis.IVA19);
	}

}
