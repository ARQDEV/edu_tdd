package com.edu.dev.produtos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductosTest {

	@Test
	public void agregarProductos() {
		Producto tenisAmarillos = new Producto();
		//tenisAmarillos.setCodigo("TT123");
		Carro carro = new Carro();
		carro.addProducto(tenisAmarillos);

		assertEquals(tenisAmarillos, carro.obtenerProducto(tenisAmarillos));

	}
	
	@Test
	public void eliminarProductos() {
		Producto tenisAmarillos = new Producto();
		tenisAmarillos.setCodigo("T123");
		Producto sombreroRojo = new Producto();
		sombreroRojo.setCodigo("S123");
		
		Carro carro = new Carro();
		carro.addProducto(tenisAmarillos);
		carro.addProducto(sombreroRojo);
		
		carro.eliminarProducto(sombreroRojo);
		Producto sombreroRojoEliminado =carro.obtenerProducto(sombreroRojo);
		
		//assertNull(carro.obtenerProducto(sombreroRojo));
		assertNull(sombreroRojoEliminado);
		
	}
	
	

}
