package org.tesji.marcocesar.encapsulacion.ejercicio;

import java.util.Arrays;
import java.util.logging.Logger;

public class Programador {
	public static Logger lo = Logger.getLogger(Programador.class.getName());

private String [] lenguajes= {"Java","C#","Visual Studio","Python","HTML"};
private String experiencia;


public Programador(String nombre,String experiencia) {
	this.nombre = nombre;
	this.experiencia=experiencia;
}

private String nombre;
public void programar(String len) {

	if (Arrays.asList(lenguajes).contains(len)) {
		lo.info("Programando HolaMundo en *-*  "+len);
		lo.info("Build Sucessful ");
		lo.info("Hecho por "+nombre +" y tu experiencia es "+experiencia);
	} else {
		lo.info("Tu sabiduria no es la correcta"); 
	}

}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getExperiencia() {
	return experiencia;
}
public void setExperiencia(String experiencia) {
	this.experiencia = experiencia;
}



}
