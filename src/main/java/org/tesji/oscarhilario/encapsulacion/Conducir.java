package org.tesji.oscarhilario.encapsulacion;

import java.util.logging.Logger;

import org.tesji.eduardocastillo.encapsulacion.ejercicio.Chef;

public class Conducir {
	private String chofer;
	public String getChofer() {
		return chofer;
	}

	public void setChofer(String chofer) {
		this.chofer = chofer;
	}

	private static Logger LOG = Logger.getLogger(Chef.class.getName());

	
	private String estado;
	private String estadoConductor;
	public String getEstadoConductor() {
		return estadoConductor;
	}

	public void setEstadoConductor(String estadoConductor) {
		this.estadoConductor = estadoConductor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getGasolina() {
		return gasolina;
	}

	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}

	public String getLlaves() {
		return llaves;
	}

	public void setLlaves(String llaves) {
		this.llaves = llaves;
	}

	private int gasolina;
	private String llaves;
	
	public void imprimirDatos() {
		if(estado.equals("Bueno")) {
			LOG.info("<<<<Verifcando datos >>>>"+	
			"\n Nombre del conductor:" + chofer	
			+"\n Estado del carro: " + estado +" esperemos que resista"
			+"\nEstado del Conductor:"+ estadoConductor
			+"\nGasolina al : "+gasolina +"%");
		//	LOG.info("Llaves:"+ llaves);
		}else if(estado.equals("Malo")) {
			LOG.info("El carro esta en mal estado, !!Precaución" +chofer);
		}
		
			
		
	}

}
