
import java.util.Scanner;
import java.util.ArrayList;

class Carrito
{
	Scanner scan = new Scanner(System.in);
	int x;
	int z;
	ArrayList<Producto> carrito = new ArrayList<Producto>();

	public Carrito()
	{
		
	}

	public void palCarro(Producto p)
	{
		carrito.add(p);
	}

	public void demo(int x, Producto p)
	{
		if (x==1)
		{
			System.out.print("Ingrese un numero de telefono: ");
			z = scan.nextInt();
			//p.llamada(z)
			//no puede ser es cierto no esta definido el metodo llamar para la super clase ya no puedo mas
		}
	}
}