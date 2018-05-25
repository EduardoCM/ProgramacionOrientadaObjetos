package org.tesji.ivonne.encapsulacion;

public class PersonaI {
	public String nombre;
	public String sexo;
	private int edad;

	public PersonaI mama;
	public PersonaI papa;
	public void setEdad(int edad) {
		if (edad<=0){
			System.out.println("Edad incorrecta");
			}else{
			this.edad=edad;
		}
	}
	public void comer(String comida){
	System.out.println("SOY "+nombre+"\n"+ "ESTOY COMIENDO "+comida+"\n");
	}

	@Override
	public String toString() {
		return "PersonaI [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]"+"\n";
	}
	
	
	public PersonaI reproducirse(PersonaI persona){
		System.out.println("...BEBÉ EN PROCESO...");
		System.out.println("INVOLUCRADOS: " + this.nombre + " y " + persona.nombre);
		PersonaI bebe = new PersonaI();
		if (this.sexo != persona.sexo) {
			this.mama = persona.mama;
			bebe.nombre = "JOSÉ";
			bebe.edad = 0;
			bebe.sexo = "M";
			return bebe;
		} else {
			return bebe;
		}
	}

}
