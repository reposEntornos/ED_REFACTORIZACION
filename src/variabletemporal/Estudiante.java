package variabletemporal;

public class Estudiante {
	
	private String nombre;
	private boolean buenaActitud;
	
	public Estudiante(String nombre, boolean buenaActitud) {
		this.nombre = nombre;
		this.buenaActitud = buenaActitud;
	}
	
	public float notaMedia (float actividades, float examen) {
		float nota = (actividades + examen) / 2;
		
		if (buenaActitud) {
			return nota + 1;
		} else {
			return nota;
		}
	}
}
