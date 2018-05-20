package org.tesji.eduardocastillo.encapsulacion.ejercicio;

import java.util.Arrays;
import java.util.logging.Logger;

public class Chef {

	private static Logger LOG = Logger.getLogger(Chef.class.getName());

	public Chef(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;
	private String[] platillos = { "enchiladas", "Espagueti", "Pollo relleno", "Cochinita Pibil", "Chiles en Nogada" };

	public void cocinar(String platilloSolicitado) {

		if (Arrays.asList(platillos).contains(platilloSolicitado)) {
			LOG.info("Preparando platillo.....");
			LOG.info("Se preparo exitosamente " + platilloSolicitado);
		} else {
			LOG.info("No cuanto ingredientes para ese platillo");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
