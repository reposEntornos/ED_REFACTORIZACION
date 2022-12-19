package parametrosaobjeto;

public class Productos {

	
	public void verProductos (Producto producto) {
		System.out.println("Producto " + producto.nomPro + 
				" Total:" + producto.cantPro*producto.pvpPro);
	}
}
