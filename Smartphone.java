class Smartphone extends Producto implements Llamada, Fotos, Internet, Videos, Portable{

	public Smartphone(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " smartphone ";

	}

	public void llamada(int n)
	{
		System.out.println("LLamando a " + n + desde() );
	}

	public void foto()
	{
		System.out.println("Tomando una foto " + desde());
	}

	public void internet(String sitio)
	{
    System.out.println("Visitando la dirección web: " + sitio + desde());

	}

	public void videos()
	{
    System.out.println("Reproduciendo video " + desde());
	}

	public void portable()
	{
		System.out.println("Este es un articulo portátil");
	}
}