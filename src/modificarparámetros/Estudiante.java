package modificarparámetros;

public class Estudiante {

	public float evaluar(float actividades, float examen, float actitud) {
		
		if (examen < 2) {
			examen = 2;
		}
		
		if (actividades < 2) {
			actividades = 2;
		}
		
		return (examen + actividades) / 2 + actitud;
	}
}
