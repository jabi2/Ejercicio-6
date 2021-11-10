import java.util.Scanner;

abstract class Producto
{

	public Producto(int precio, String serie, String marca, String fechaf, String ar){
		this.precio = precio;
		this.serie = serie;
		this.marca = marca;
		this.fechaf = fechaf;
		this.ar = ar;
		
	}

	protected int precio;
	protected String serie;
	protected String marca;
	protected String fechaf;
	protected String ar;
	protected String tipo;


	public String desde()
	{
		return " desde mi" + this.tipo + this.marca + "...";
	}

}