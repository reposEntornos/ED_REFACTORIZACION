package cambiarfirma;

public class FirmaPrincipal {

	public static void main(String[] args) {
		
		EstudianteFirma estudiante = new EstudianteFirma("Juan");
		
		System.out.println(estudiante.notaMedia(7, 5, true));

	}

}
