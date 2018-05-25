package org.tesji.alejandromaldonado.encapsulacionMusi.ejercicio;


import java.util.logging.Logger;



public class descargaMusi {
	private static Logger LOG = Logger.getLogger(descargaMusi.class.getName());

	private String Yo;
	private String nombre;
	private String autor;
	private String reproducir;
	
	



	@Override
	public String toString() {
		return "descargaMusi [Yo=" + Yo + "]";
	}


	public String getYo() {
		return Yo;
	}


	public void setYo(String yo) {
		Yo = yo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getReproducir() {
		return reproducir;
	}


	public void Reproducir(boolean reproducir) {
		
		descargaMusi noReproducen = null;
		
		if(reproducir == true) {
			System.out.println("Comenzando a tocar la cancion elegida...");
			System.out.println(this.Yo + "  reproduce la cancion:: " +
			 this.nombre + "  del autor: " + this.autor );
			
		}else if (noReproducen == null) {
			System.out.println("Nadie Reproduce la cancion...");
			
		}else {
			LOG.info("NO cuentas con la cancion solicitada");
		}
		
		
		
	}


	public static Logger getLOG() {
		return LOG;
	}


	public static void setLOG(Logger lOG) {
		LOG = lOG;
	}




	public void setReproducir(String reproducir) {
		this.reproducir = reproducir;
	}






}
