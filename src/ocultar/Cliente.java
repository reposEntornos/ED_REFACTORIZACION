package ocultar;

public class Cliente {

	String nombre;
	int id;
	
	public Cliente() {
		inicializar();
	}

	private void inicializar() {
		nombre = "Pedro Palacios";
		id = 8;		
	}
	
	public String toString() {
		return id + ":" + nombre;
	}
}
