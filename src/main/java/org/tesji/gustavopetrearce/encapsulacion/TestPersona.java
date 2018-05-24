package org.tesji.gustavopetrearce.encapsulacion;

public class TestPersona {

	public static void main(String[] args) {
		Persona juanito = new Persona();
		juanito.setNombre("Juan");
		juanito.setSexo("M");
		juanito.setEdad(20);
		juanito.comer("Hamburguesa");
		System.out.println(juanito);
		
		Persona anita = new Persona("Ana","F",25);
		
		anita.reproducirse(juanito);
		
		Persona nuevoBebe = anita.reproducirse(juanito);
		
		System.out.println("Welcome: " + nuevoBebe);
		System.out.println("Mamá: " + nuevoBebe.getMama().getNombre());
		System.out.println("Papá: " + nuevoBebe.getPapa().getNombre());
		
		/*
		Persona gustavo = new Persona();
		gustavo.nombre = "Gustavo";
		gustavo.sexo = "M";
		gustavo.setEdad(27);
		gustavo.comer("Tacos");
		System.out.println(gustavo);*/
	}

}
