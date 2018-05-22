package org.tesji.cesargiovani.encapsulacion.ejercicio;

import java.util.logging.Logger;

import org.tesji.eduardocastillo.encapsulacion.ejercicio.Chef;

public class Gamer {
	private String nombre;
	private String juego;

	private static Logger LOG = Logger.getLogger(Chef.class.getName());

	public Gamer() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public void jugar(boolean consola) {
		if (consola) {
			LOG.info("La consola esta iniciando...");
			LOG.info(this.nombre + " va a jugar " + this.juego);
		} else {
			LOG.info("Primero enciende la consola :v");
		}
	}
}
