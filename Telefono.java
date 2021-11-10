class Telefono extends Producto{

	public Telefono(int precio, String serie, String marca, String fecha, String ar){
		super(precio, serie, marca, fecha, ar);
		tipo = " telefono fijo ";

	}
  	public void llamada(int n)
	{
		System.out.println("LLamando a " + n + desde() );
	}
}