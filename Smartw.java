class Smartw extends Producto{

	public Smartw(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " smartwatch ";

	}
public void llamada(int n)
	{
		System.out.println("LLamando a " + n + desde() );
	}
  
  public void foto()
	{
		System.out.println("Tomando una foto " + desde());
	}

	public void portable()
	{
		System.out.println("Este es un articulo portátil");
	}
}