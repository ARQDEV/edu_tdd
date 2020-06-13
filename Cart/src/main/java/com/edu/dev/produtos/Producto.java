package com.edu.dev.produtos;

public class Producto {

	private String codigo;
	private double precio;
	private static double IVA19 = 19;  

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
