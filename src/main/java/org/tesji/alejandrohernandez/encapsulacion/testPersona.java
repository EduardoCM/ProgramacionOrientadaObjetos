package org.tesji.alejandrohernandez.encapsulacion;

public class testPersona {

	public static void main(String arg[]) {
		Persona juanito = new Persona("Juan", "M", 25);

		juanito.comer = "Hamburguesa";
		System.out.println(juanito);

		Persona anita = new Persona("Ana", "F", 25);
		Persona nuevobebe = anita.reproducirse(juanito);

		System.out
				.println("Welcome " + nuevobebe +
						 " tu papa es " + nuevobebe.papa + 
						 " y tu mama es " + nuevobebe.mama);
		/*
		 * Persona alex= new Persona(); alex.nombre="Alex"; alex.sexo="M";
		 * alex.setEdad(1020); alex.comer="Alambre"; System.out.println();
		 */
	}

}
