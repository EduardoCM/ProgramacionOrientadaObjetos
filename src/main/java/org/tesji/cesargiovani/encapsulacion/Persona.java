package org.tesji.cesargiovani.encapsulacion;

public class Persona {
	public String nombre;
	public String sexo;
	private int edad;
	public Persona mama;
	public Persona papa;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}else {
			System.out.println("No se puede agregar esta edad");
		}
	}

	public void comer(String comida) {
		System.out.println("Mi nombre es: " + nombre + "\nSoy: " + sexo + "\nTengo la edad de: " + edad
				+ "\nEstoy comiendo: " + comida);
	}

	public Persona reproducirse(Persona persona) {
		System.out.println("Bebe en proceso..........");
		System.out.println("Entre: " + this.nombre + " y " + persona.nombre);
		Persona bebe = new Persona();
		if (this.sexo != persona.sexo) {
			//this.papa = nombre;
			this.mama = persona.mama;
			bebe.nombre = "Jorge";
			bebe.edad = 0;
			bebe.sexo = "M";
			return bebe;
		} else {
			return bebe;
		}
	}
}