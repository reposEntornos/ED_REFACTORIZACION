package variablestmp;

public class factura {

	public float precioTotal (float precio, float iva, float descuento) {
		float temp = 0;
		temp = (precio * iva) / 100;
		System.out.println("IVA aplicado: " + temp);
		temp = precio + temp;
		System.out.println("Total con IVA: " + temp);
		
		return temp - descuento;
	}
}
