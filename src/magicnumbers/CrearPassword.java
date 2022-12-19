package magicnumbers;

import java.util.Random;

public class CrearPassword {

	private Random random = new Random();
	private String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
	
	public String CrearPassword(int length)  {
		if (length < 6 || length > 15) {
			return "Longitud de Contraseña no correcta";
		} else {
			String password = "";
			for (int i=0; i<length; i++)
				password += caracteres.charAt(random.nextInt(caracteres.length()));
				return password;
		}		
	}	
}
