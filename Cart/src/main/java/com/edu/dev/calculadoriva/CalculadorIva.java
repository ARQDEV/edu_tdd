package com.edu.dev.calculadoriva;

import java.io.IOException;

import com.edu.dev.productos.Producto;

public interface CalculadorIva {
    double getIvaProducto(Producto producto) throws IOException;
}
