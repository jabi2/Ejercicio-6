class Camara extends Producto implements Fotos, Videos, Portable{

	public Camara(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " camara ";

	}

	public void foto()
	{
		System.out.println("Estoy tomando una foto " + desde());
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