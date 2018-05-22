package org.tesji.alejandrohernandez.encapsulacion.ejercicio;


import java.util.logging.Logger;

public class Refacciones {

	public Refacciones(String cliente)
	{
		this.cliente=cliente;
	}
	private String nombrerefaccion;
	private String cliente;
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNombrerefaccion() {
		return nombrerefaccion;
	}

	public void setNombrerefaccion(String nombrerefaccion) {
		this.nombrerefaccion = nombrerefaccion;
	}

	private static Logger LOG = Logger.getLogger(Refacciones.class.getName());
	String[][] refaccion = { { "1", "balatas", "$600" }, 
							 { "2", "Aceite", "$1000" }, 
							 { "3", "bandas", "$300" },
							 { "4", "Liq. frenos", "$200" }, 
							 { "5", "baleros", "$100" }, 
							 { "6", "discos", "$400" },
							 { "7", "enbragues", "$2000" }, 
							 { "8", "bieletas", "$150" } };

	public void imprimir(String nomRefaccion) {
		this.nombrerefaccion=nomRefaccion;
		Boolean Existe=false;
		for (int i = 0; i < refaccion.length; i++) {
			if (refaccion[i][1].toString() == this.nombrerefaccion) {
				LOG.info("Buscando refacción.....");
				LOG.info("El precio de la refacción(" + refaccion[i][1] + ") que ingreso es de " + refaccion[i][2]);
				Existe = true;
				break;
			} 
		}
		if(Existe==false)
		{
			LOG.info("La refaccion no esta en existencia");
		}
		
	}

}
