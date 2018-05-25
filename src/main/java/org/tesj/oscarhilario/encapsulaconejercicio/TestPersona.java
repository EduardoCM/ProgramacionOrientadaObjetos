package org.tesj.oscarhilario.encapsulaconejercicio;

public class TestPersona {
	public static void main (String []args) {
		// TODO Auto-generated method stub
		Persona juanito = new Persona();
		Persona oscar = new Persona();
		
		juanito.nombre="Juanita";
		juanito.setEdad(21);
		juanito.sexo="M";
		//juanito.comer("Chilaqules");
		
		Persona anita = new Persona();
		anita.nombre="Ana";
		anita.sexo="F";
		anita.setEdad(20);
		anita.reproucirse(juanito);
		Persona nuevoBebe = anita.reproucirse(juanito);
			
		if(juanito.sexo=="M" && anita.sexo=="F") {
			System.out.println("Welcome Bebe"+nuevoBebe);
				
		}else {
			System.out.println("No se puede reproducir entre personas del mismoo "
					+ "sexo");
		}
		
		/*	System.out.println(juanito);
		oscar.nombre="Juan";
		oscar.setEdad(-10);
		oscar.sexo="M";
		oscar.comer("Enchiladas");
		System.out.println(oscar);
		*/
	
	}

}
