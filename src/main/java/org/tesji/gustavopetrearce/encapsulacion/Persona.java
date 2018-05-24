package org.tesji.gustavopetrearce.encapsulacion;

public class Persona {
	private String nombre;
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
	
	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad = edad;
		}else {
			System.out.println("Dato incorrecto");
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getMama() {
		return mama;
	}

	public void setMama(Persona mama) {
		this.mama = mama;
	}

	public int getEdad() {
		return edad;
	}
	
	public void comer(String comida) {
		System.out.println("Soy" + nombre + " estoy comiemdo: " + comida);
	}
	
	public Persona reproducirse(Persona persona) {
		Persona bebe = null;
		if(this.sexo.equals(persona.sexo)) {
			System.out.println("No se peueden reproducrie entre el mismo sexo");
		}else {
		System.out.println("bebe en proceso...");
		bebe = new Persona();
		System.out.println("Entre: " + this.nombre + " y " + persona.nombre);
		
		if(sexo.equals("F")){
            bebe.mama = this;
            bebe.papa = persona;
        }else if (sexo.equals("M")){
            bebe.papa = this;
            bebe.mama = persona;
        }
		
		bebe.nombre = "Jorge";
		bebe.sexo = "M";
		bebe.edad = 0;
		}
		return bebe;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Persona getPapa() {
		return papa;
	}

	public void setPapa(Persona papa) {
		this.papa = papa;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}		
}
