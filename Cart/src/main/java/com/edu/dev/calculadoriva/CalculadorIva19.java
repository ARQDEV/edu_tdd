package com.edu.dev.calculadoriva;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.edu.dev.productos.Producto;

public class CalculadorIva19 implements CalculadorIva {

	//private static final double IVA_19 = 1.19;

	

	@Override
	public double getIvaProducto(Producto producto) throws IOException {
		
		Properties properties = readPropertiesFile("config.properties");
		double IVA = Double.parseDouble(properties.getProperty("iva"));
		return producto.getPrecio() * IVA;
	}

	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			// create Properties class object
			prop = new Properties();
			// load properties file into it
			prop.load(fis);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			fis.close();
		}

		return prop;
	}

}
