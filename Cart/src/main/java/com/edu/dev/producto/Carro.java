package com.edu.dev.producto;

import java.util.HashMap;
import java.util.Map;

public class Carro {

	private Map<String, Producto> listaProducto;

	public Carro() {
		listaProducto = new HashMap<>();
	}

	public void addProducto(Producto producto) {
		listaProducto.put(producto.getCodigo(), producto);
	}

	public Producto obtenerProducto(Producto producto) {
		return listaProducto.get(producto.getCodigo());
	}

	public void eliminarProducto(Producto producto) {
		listaProducto.remove(producto.getCodigo());
	}

}
