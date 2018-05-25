package org.tesji.marcocesar.encapsulacion;

public class TestPersona {
public static void main(String[] args) {


	PersonaF juanita= new PersonaF();
	juanita.nombre="juan";
	juanita.sexo="M";
	juanita.setEdad(20);
	juanita.comer("hamburgesa");
	//System.out.println(juanita);



PersonaF anita = new PersonaF();
anita.nombre="Ana";
anita.sexo="F";
anita.setEdad(25);


/*if(juanita.sexo=="F" && anita.sexo=="F" ) {
	System.out.println("Son del mismo sexo");
}else if(juanita.sexo=="M" && anita.sexo=="M"){
	System.out.println("Son del mismo sexo");
}else {
	
*/
PersonaF nuevoBebe= anita.reproducirse(juanita);
	 System.out.println("Welcome: "+ nuevoBebe.nombre);
		System.out.println("Papa es " + juanita.nombre);
		System.out.println("Mama es " + anita.nombre);
//}



/*
PersonaF marco=new PersonaF();
marco.nombre="marco";
marco.sexo="M";
marco.setEdad(22);;
marco.comer("pollo");
System.out.println(marco);
*/
}
}
