package cambiarfirma;

public class EstudianteFirma {

	private String nombre;
	private boolean buenaActitud;
	
	public EstudianteFirma(String nombre) {
		this.nombre = nombre;
		
	}
	
	public float notaMedia (float actividades, float examen, boolean actitud) {
		float nota = (actividades + examen) / 2;
		
		if (buenaActitud) {
			return nota + 1;
		} else {
			return nota;
		}
	}
}
