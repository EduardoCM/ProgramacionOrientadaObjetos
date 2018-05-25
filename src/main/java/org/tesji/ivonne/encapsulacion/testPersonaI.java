package org.tesji.ivonne.encapsulacion;

public class testPersonaI {
public static void main(String[] args) {


	PersonaI persona= new PersonaI();
	persona.nombre="oziel";
	persona.sexo="M";
	persona.setEdad(22);
	persona.comer("pizza");

PersonaI persona1 = new PersonaI();
persona1.nombre="nicole";
persona1.sexo="F";
persona1.setEdad(22);

PersonaI nuevoBebe= persona1.reproducirse(persona);
	 System.out.println("WELCOME: "+ nuevoBebe.nombre);
		System.out.println("PAPÁ:" + persona.nombre);
		System.out.println("MAMÁ:" + persona1.nombre);
}
}

