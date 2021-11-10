class Celular extends Producto{

	public Celular(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " celular ";

	}
  public void llamada(int n)
	{
		System.out.println("LLamando a " + n + desde() );
	}

	public void portable()
	{
		System.out.println("Este es un articulo portátil");
	}
}