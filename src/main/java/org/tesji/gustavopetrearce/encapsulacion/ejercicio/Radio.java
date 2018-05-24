package org.tesji.gustavopetrearce.encapsulacion.ejercicio;

import java.util.Arrays;
import java.util.logging.Logger;

public class Radio {
	private String frecuencia;
	private String estacion;
	private String nombre;
	private String[] frecuencias = {"100.5","88.1","90.5","91.3"};
	private static Logger LOG = Logger.getLogger(Radio.class.getName());
	
	public Radio(String frecuencia) {		
		this.frecuencia = frecuencia;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void sintonizar() {
		if (Arrays.asList(frecuencias).contains(frecuencia)) {
			LOG.info("Buscando estacion.....");
			LOG.info("Estacion sintonizada ");
			if(frecuencia.equals("100.5")) {
				setNombre("Super Stereo 100.5");
				setEstacion("XHIDO-FM");
			} else if(frecuencia.equals("88.1")) {
				setNombre("Universal 88.1");
				setEstacion("XHRED-FM");
			}else if(frecuencia.equals("90.5")) {
				setNombre("Imagen");
				setEstacion("XEDA-FM");
			}else if(frecuencia.equals("91.3")) {
				setNombre("Alfa 91.3");
				setEstacion("XHFAJ-FM");
			}
			LOG.info("Frecuencia " + frecuencia + " Estacion " + estacion + " " + nombre );
		} else {
			LOG.info("No se encontro la estacion");
		}
	}
	
}
