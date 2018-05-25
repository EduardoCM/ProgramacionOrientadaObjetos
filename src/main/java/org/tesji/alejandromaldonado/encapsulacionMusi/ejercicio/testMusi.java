package org.tesji.alejandromaldonado.encapsulacionMusi.ejercicio;


public class testMusi {

	public static void main(String[] args) {
		descargaMusi musica = new descargaMusi();
		musica.setYo("Alejandro");
		musica.setNombre("La chona");
		musica.setAutor("Sebastian Jimenez");
		musica.Reproducir(true);

	}

}