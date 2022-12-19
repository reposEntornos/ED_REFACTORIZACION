package parametrosaobjeto;

public class Producto {
	public int idProducto;
	public String nomPro;
	public String desPro;
	public int cantPro;
	public float pvpPro;

	public Producto(int idProducto, String nomPro, String desPro, int cantPro, float pvpPro) {
		this.idProducto = idProducto;
		this.nomPro = nomPro;
		this.desPro = desPro;
		this.cantPro = cantPro;
		this.pvpPro = pvpPro;
	}
}