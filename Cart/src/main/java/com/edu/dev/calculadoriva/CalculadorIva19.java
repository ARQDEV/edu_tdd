package com.edu.dev.calculadoriva;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.Properties;

import com.edu.dev.productos.Producto;

public class CalculadorIva19 implements CalculadorIva {
	
	private static Logger LOGGER = Logger.getLogger("IvaLogging");
	  
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
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			LOGGER.info(e.getMessage());
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		} finally {
			fis.close();
		}

		return prop;
	}

}
