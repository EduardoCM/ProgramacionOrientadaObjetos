package org.tesji.oscarhilario.encapsulacion;

public class TestConducir {
	
	public static void main(String []args) {
		Conducir t1= new Conducir();
		t1.setChofer("Juan");
		t1.setEstado("Bueno");
		t1.setEstadoConductor("Bueno");
		t1.setGasolina(50);
		t1.setLlaves("Si");
		t1.imprimirDatos();
	}

}
