package variableexpresión;

public class Venta {

	public boolean aplicarDescuento() {
		if (factura.getCliente().getEdad() < 25 && 
				factura.getCliente().esDesempleado() &&
				  factura.Total() > 100 {
					return true;
				}else {
					return false;
				}
	}
}
