package com.edu.dev.calculadoriva;

import com.edu.dev.productos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadorIva19Test {
    private CalculadorIva19 calculadorIva19 = new CalculadorIva19();
    @Test
    public void getIvaProducto(){
        Producto tennisAdidas = new Producto();
        tennisAdidas.setCodigo("add12333");
        tennisAdidas.setPrecio(150000);
        assertEquals(178500, calculadorIva19.getIvaProducto(tennisAdidas));
    }

}