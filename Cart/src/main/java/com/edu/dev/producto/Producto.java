package com.edu.dev.producto;

import java.math.BigDecimal;

public class Producto {

	private String codigo;
	private BigDecimal precio;
	public static final double IVA19 = 1.19;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
