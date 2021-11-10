class Desktop extends Producto{
  
  public Desktop(int precio, String serie, String marca, String fecha, String ar){
    super(precio, serie, marca, fecha, ar);
		tipo = " desktop ";
  }
	public void internet(String sitio)
	{
    System.out.println("Visitando la dirección web: " + sitio + desde());

	}

	public void videos()
	{
    System.out.println("Reproduciendo video " + desde());
	}

	public void juegos(String x)
  {
   System.out.println("Jugando " + desde());
  }

}