package com.edu.dev.calculadoriva;

import com.edu.dev.productos.Producto;

public class CalculadorIva19 implements CalculadorIva {

    private static final double IVA_19 = 1.19;

    @Override
    public double getIvaProducto(Producto producto) {
        return producto.getPrecio() * IVA_19;
    }
}
