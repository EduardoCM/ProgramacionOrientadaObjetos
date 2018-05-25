package org.tesji.ivonne.encapsulamiento.ejercicio;

import java.util.Arrays;
import java.util.logging.Logger;


public class Telefono {
	public static Logger ivonne = Logger.getLogger(Telefono.class.getName());
	private String[] contactos= {"ana","pedro","juan","cesar"};
	private String accion;
	
	public Telefono(String accion) {
		this.accion=accion;
	}
	
	public void contacto(String contacto) {

		if (Arrays.asList(contactos).contains(contacto)) {
				ivonne.info("USTED QUIERE "+ accion + " A " + contacto +" PROCESANDO..... ");
				ivonne.info("ESPERE UN MOMENTO");
		} else {
			ivonne.info("EL CONTACTO NO EXISTE, POR FAVOR INGRÉSELO"); 
		}
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
}
