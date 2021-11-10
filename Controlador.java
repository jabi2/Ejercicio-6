class Controlador {
  public static void main(String[] args) {
		Vista vista = new Vista();
		Carrito carro = new Carrito();
		int opcion = 0;
		int x = 0;
		Producto p;
		int precio;


		while (opcion != 3)
		{
			opcion = vista.menu();

			if (opcion == 1)
			{
				x = vista.productos();

				if (x== 1)
				{
					Smartphone s = new Smartphone(vista.precio(), vista.serie(), vista.marca(), vista.fecha(), vista.ar());
					System.out.println("Hello world!");


				}

				
			}
		}

		
  }

}