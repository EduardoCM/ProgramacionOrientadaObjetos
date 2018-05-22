package org.tesji.alejandrohernandez.encapsulacion;

public class Persona {

	public String nombre;
	public String sexo;
	private int edad;
	public String comer;
	public String mama;
	public String papa;

	public Persona() {

	}

	public Persona(String nombre, String Sexo, int edad) {
		this.nombre = nombre;
		this.sexo = Sexo;
		this.edad = edad;
	}

	public void setEdad(int Edad) {
		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("los años que se ingresan no pueden ser menores o igual a cero");
		}

	}

	public void comer(String comida) {
		System.out.println("Soy: " + nombre + " tengo " + edad + " años" + " estoy comiendo: " + comida);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", comer=" + comer + "]";
	}

	public Persona reproducirse(Persona persona) {
		System.out.println("bebe en proceso.......");
		System.out.println("Entre: " + this.nombre + " y " + persona.nombre);

		Persona bebe = new Persona();
		if (this.sexo != persona.sexo) {
			bebe.nombre = "Jorge";
			bebe.sexo = "M";
			bebe.edad = 0;
			bebe.papa = (this.sexo == "M") ? this.nombre : persona.nombre;
			bebe.mama = (this.sexo == "F") ? this.nombre : persona.nombre;
			return bebe;
			/*
			 * if (this.sexo == "M") { bebe.papa = this.nombre; bebe.mama=persona.nombre; }
			 * else { bebe.papa = persona.nombre; bebe.mama=this.nombre; }
			 */

		} else {
			System.out.println("no se pueden crear bebes con dos personas del mismo sexo");
			return bebe;
		}
		
	}

}
