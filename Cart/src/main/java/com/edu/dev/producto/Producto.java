package com.edu.dev.producto;

public class Producto {

	private String codigo;
	private double precio;
	public static Double IVA19 = new Double(19);  

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
