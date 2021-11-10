class SmartTV extends Producto{

	public SmartTV(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " Smart TV ";

	}
	public void internet(String sitio)
	{
    System.out.println("Visitando la dirección web: " + sitio + desde());
	}

	public void videos()
	{
    System.out.println("Reproduciendo video " + desde());
	}
}