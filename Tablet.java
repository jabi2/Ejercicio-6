class Tablet extends Producto{

	public Tablet(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " tablet ";

	}
	public void internet(String sitio)
	{
    System.out.println("Visitando la dirección web: " + sitio + desde());
	}

	public void videos()
	{
    System.out.println("Reproduciendo video " + desde());
	}

	public void foto()
	{
		System.out.println("Estoy tomando una foto " + desde());
	}
  
public void portable()
	{
		System.out.println("Este es un articulo portátil");
	}
}