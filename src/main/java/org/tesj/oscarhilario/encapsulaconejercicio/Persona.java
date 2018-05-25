package org.tesj.oscarhilario.encapsulaconejercicio;

import java.util.logging.Logger;

import org.tesji.eduardocastillo.encapsulacion.ejercicio.Chef;

public class Persona {
	public String nombre;
	public String sexo;
	private int edad;
	public Persona papa;
	public Persona mama;
	public void setEdad(int edad) {
		if(edad >=0) {
			this.edad=edad;
		}else {
			System.out.print("No se permiten valores negativos");
			
		}
	}
	private static Logger LOG = Logger.getLogger(Chef.class.getName());

	/*public void setSexo(String sexo) {
		
		if(sexo.equals("M") && sexo.equals("F")) {
			this.sexo=sexo;
		}else {
			System.out.println("No puede haber reproduccion entre"
					+ " 2 personas iguales");
		}
	}
	*/
	public void comer(String comida) {
		System.out.println("Soy:"+nombre +"\nEdad:"+edad+"\nSexo:"+sexo+"\nEstoy comiendo"+ comida);

	}
/*	@Override
	public String toString() {
		return "App [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	*/
	public Persona reproucirse(Persona persona){
	//	System.out.println("Bebe loading............");
	//	System.out.println("Entre: "+this.nombre+" y "+persona.nombre);
			
		
	
		LOG.info("Bebe Loading.........."
		+"Entre: "+nombre+ "y" +persona.nombre);
		Persona bebe= new Persona();
		bebe.nombre="Jorge";
		bebe.sexo="M";
		bebe.edad=0;
		
		return bebe;
		
	}
	

}
