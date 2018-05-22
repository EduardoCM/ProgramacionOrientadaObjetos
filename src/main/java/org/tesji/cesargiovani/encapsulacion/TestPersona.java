package org.tesji.cesargiovani.encapsulacion;

public class TestPersona {
	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.nombre = "Juan";
		juan.sexo = "M";
		juan.setEdad(28);
		juan.comer("Tacos");

		Persona anita = new Persona();
		anita.nombre = "Ana";
		anita.sexo = "F";
		anita.setEdad(25);
		Persona nuevoBebe = anita.reproducirse(juan);
		System.out.println("Welcome: " + nuevoBebe.nombre);
		System.out.println("Papá " + nuevoBebe.papa);
		System.out.println("Mamá " + nuevoBebe.mama);
	}

}
