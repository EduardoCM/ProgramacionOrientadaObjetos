package org.tesji.orlandosanchez.encapsulacion.ejercicio;

import java.util.Arrays;
import java.util.logging.Logger;



public class Auto {
	public Auto(String modelo, String marca, String puertas) {
		this.modelo = modelo;
		this.marca = marca;
		this.puertas = puertas;
		
	}
	
	private static Logger LOG = Logger.getLogger(Auto.class.getName());

	private String modelo;
	private String marca;
	private String puertas;
	private String[] combustible = { "GASOLINA", "ENERGIA ELECTRICA", "GAS","HIBRIDO" };
    
	
public void encender(String combustibles) {
	
	if (Arrays.asList(combustible).contains(combustibles)) {
		LOG.info("Encendiendo auto.........");
		LOG.info("Auto encendido accionado por: " + combustibles);
		LOG.info(""+modelo+" | "+marca+" | "+puertas+" puertas");
		LOG.info("---BUEN VIAJE---");
	} else {
		LOG.info("Combustible no compatible :" + combustibles);
	}

}
	
	
}

