package cambiarfirma;

public class FirmaPrincipal {

	public static void main(String[] args) {
		
		EstudianteFirma estudiante = new EstudianteFirma("Juan");
		
		if (estudiante.notaMedia(7, 5, true) > 5)
			System.out.println("APROBADO");
		else
			System.out.println("SUSPENSO");

	}

}
