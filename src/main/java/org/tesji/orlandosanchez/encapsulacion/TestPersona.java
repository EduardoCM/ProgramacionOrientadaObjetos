package org.tesji.orlandosanchez.encapsulacion;

public class TestPersona {
	public static void main(String args []) {
		Persona juanito = new Persona("Juanito","M",23);

		//juanito.nombre = "Juanita";
	//	juanito.setSexo("F");
	//	juanito.setEdad(10);
		juanito.comer("Hamburguesa");

		System.out.println(juanito);
		
		
		Persona anita=new Persona("Ana","F",25);
		//anita.nombre="Ana";
	    //anita.setSexo("F");
		//anita.setEdad(25);	
		
		
		Persona nuevobebe=anita.reproducirse(juanito);
		
		
		System.out.println("WELCOME " + nuevobebe);
		
		

		if (nuevobebe != null) {
			System.out.println("PAPÁ: "+nuevobebe.getPapa().getNombre());
			System.out.println("MAMÁ: "+nuevobebe.getMama().getNombre());
			
		}
		/*Persona orlando = new Persona();

		orlando.nombre = "Orlando";
		orlando.sexo = "M";
		orlando.setEdad(21);
		orlando.comer("Ensalada");
        System.out.println(orlando);
	*/
	}

}
