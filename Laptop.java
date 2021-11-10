class Laptop extends Producto{

	public Laptop(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " laptop ";

	}
 	public void internet(String sitio)
	{
    System.out.println("Visitando la dirección web: " + sitio + desde());

	}

	public void videos(String x)
	{
    System.out.println("Reproduciendo video " + x + desde());
	}

	public void juegos(String x)
  {
   System.out.println("Jugando " + x + desde());
  }
  
public void portable()
	{
		System.out.println("Este es un articulo portátil");
	}
  
}