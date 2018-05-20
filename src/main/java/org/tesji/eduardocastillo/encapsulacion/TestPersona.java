package org.tesji.eduardocastillo.encapsulacion;

import java.util.logging.Logger;

public class TestPersona {

	private static Logger LOG = Logger.getLogger(TestPersona.class.getName());

	public static void main(String[] args) {

		Persona juan = new Persona();
		juan.setNombre("Juan");
		juan.setSexo("M");

		Persona karo = new Persona();
		karo.setNombre("Karolina");
		karo.setSexo("F");

		Persona hijo = juan.reproducirse(karo);

		if (hijo != null) {
			LOG.info("Madre: " + hijo.getMadre().getNombre());
			LOG.info("Padre: " + hijo.getPadre().getNombre());
		}
	}

}
