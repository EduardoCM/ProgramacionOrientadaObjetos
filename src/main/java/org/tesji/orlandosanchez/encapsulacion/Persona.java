package org.tesji.orlandosanchez.encapsulacion;

public class Persona {
	public String nombre;
	private String sexo;
	private int edad;
	private Persona mama;
	private Persona papa;

	public Persona(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public Persona() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(String sexo) {
	}

	public Persona getMama() {
		return mama;
	}

	public void setMadre(Persona mama) {
		this.mama = mama;
	}

	public Persona getPapa() {
		return papa;
	}

	public void setPapa(Persona papa) {
		this.papa = papa;
	}

	public void setEdad(int edad) {

		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("EDAD INCORRECTA ES NEGATIVA");
		}
	}

	public void comer(String comida) {
		System.out.println("Soy " + nombre + " Estoy comiendo  " + comida);
	}

	public Persona reproducirse(Persona persona) {
		Persona bebe = new Persona();

		if (this.sexo.equals(persona.sexo) || this.sexo.equals(null) || persona.sexo.equals(null)) {
			System.out.println("No puede reproducirse");
			bebe.equals(0);
		} else {
			if (sexo.equals("F")) {
				bebe.mama = this;
				bebe.papa = persona;
			} else if (sexo.equals("M")) {
				bebe.papa = this;
				bebe.mama = persona;
			}

			bebe.nombre = "Jorge";
			bebe.sexo = "M";
			bebe.edad = 0;

			System.out.println("bebe en processoooo........");
			System.out.println("ENTRE " + this.nombre + " y " + persona.nombre);

		}

		return bebe;

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}

}
