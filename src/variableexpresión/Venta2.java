package variableexpresión;

public class Venta2 {

	public boolean aplicarDescuento() {
		boolean esJoven = factura.getCliente().getEdad() < 25;
		boolean esDesempleado = factura.getCliente().getEmpleado()==null;
		boolean esVentaSup100 = factura.Total() > 100;
		
		if (esJoven && esDesempleado && esVentaSup100) {
					return true;
				}else {
					return false;
				}
	}
}
