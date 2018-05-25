package org.tesji.marcocesar.encapsulacion;

public class PersonaF {
	public String nombre;
	public String sexo;
	private int edad;

	public PersonaF mama;
	public PersonaF papa;
	public void setEdad(int edad) {
		
		if (edad<=0){
			System.out.println("Tu edad es erronia es negativa");
			
			}else{
			//System.out.println("Tu edad es correcta es positiva");
			this.edad=edad;
		}
	}
	public void comer(String comida){
	System.out.println("Soy "+nombre+"\n"+ "Estoy comiendo "+comida+"\n");
	}

	@Override
	public String toString() {
		return "PersonaF [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]"+"\n";
	}
	
	
	public PersonaF reproducirse(PersonaF persona){
		System.out.println("Bebe en proceso..........");
		System.out.println("Entre: " + this.nombre + " y " + persona.nombre);
		PersonaF bebe = new PersonaF();
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