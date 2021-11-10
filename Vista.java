
import java.util.Scanner;

class Vista
{

	Scanner scan = new Scanner(System.in);
	int opcion = 0;
	String x;

	public Vista()
	{
		System.out.println("Bienvenido a Electrónica Latinoamericana");
	}

	public int menu()
	{
		System.out.println("\nQue desea hacer? ");
		System.out.println("1. Ver productos ");
		System.out.println("2. Ver Carrito ");
		System.out.println("3. Salir ");
		return opcion();
	}

	public int opcion()
	{
		System.out.println("\nElija una opcion: ");
		try{
          opcion = scan.nextInt();
        } catch (Exception a)
        {
          System.out.print("Opcion no disponible.\n");
          scan.nextLine();
          opcion = 20;
        }

        if (opcion < 0)
        {
          System.out.print("Opcion no disponible.\n");
          scan.nextLine();
          opcion = 20;
        }

        return opcion;
	}

	public int productos()
	{
		System.out.println("\nLos productos que ofrecemos son: ");
		System.out.println("1. Smartphones");
		System.out.println("2. Telefonos celulares");
		System.out.println("3. Telefonos fijos");
		System.out.println("4. Camaras");
		System.out.println("5. Computadores Desktop");
		System.out.println("6. Laptops");
		System.out.println("7. Smart TVs");
		System.out.println("8. Tablets");
		System.out.println("9. Smartwatch");
		
		return opcion();

	}

	public int p1()
	{
		System.out.println("Que desea probar? ");
		System.out.println("1. Llamada");
		System.out.println("2. Fotos");
		System.out.println("3. Internet");
		System.out.println("4. Videos");
		System.out.println("5. Es portable");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p2()
	{
		System.out.println("Que desea probar? ");
		System.out.println("1. Llamada");
		System.out.println("5. Es portable");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p3()
	{
		System.out.println("Que desea probar? ");
		System.out.println("1. Llamada");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p4()
	{
		System.out.println("Que desea probar? ");
		System.out.println("2. Fotos");
		System.out.println("4. Videos");
		System.out.println("5. Es portable");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p5()
	{
		System.out.println("Que desea probar? ");
		System.out.println("3. Internet");
		System.out.println("4. Videos");
		System.out.println("6. Videojuegos");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p6()
	{
		System.out.println("Que desea probar? ");
		System.out.println("3. Internet");
		System.out.println("4. Videos");
		System.out.println("6. Videojuegos");
		System.out.println("5. Es portable");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p7()
	{
		System.out.println("Que desea probar? ");
		System.out.println("3. Internet");
		System.out.println("4. Videos");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		
		return opcion();
	}

	public int p8()
	{
		System.out.println("Que desea probar? ");
		System.out.println("2. Fotos");
		System.out.println("4. Videos");
		System.out.println("3. Internet");
		System.out.println("5. Es portable");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int p9()
	{
		System.out.println("Que desea probar? ");
		System.out.println("2. Fotos");
		System.out.println("2. Llamadas");
		System.out.println("5. Es portable");
		System.out.println("0. Agregar al carrito");
		System.out.println("20. Regresar");
		return opcion();
	}

	public int precio()
	{
		System.out.println("\nIngrese el precio del producto (entero): ");
		try{
          opcion = scan.nextInt();
        } catch (Exception a)
        {
          System.out.print("Opcion no disponible.\n");
          scan.nextLine();
          opcion = 500;
        }

        if (opcion < 0)
        {
          System.out.print("Opcion no disponible.\n");
          scan.nextLine();
          opcion = 500;
        }

        return opcion;
	}

	public String serie()
	{
		System.out.print("\nIngrese la serie del producto: ");
    x = scan.nextLine();
		return x;
	}

	public String marca()
	{
		System.out.print("\nIngrese la marca del producto: ");
    x = scan.nextLine();
		return x;
	}

	public String fecha()
	{
		System.out.print("\nIngrese la fecha de fabricacion del producto: ");
    x = scan.nextLine();
		return x;
	}

	public String ar()
	{
		System.out.print("\nIngrese el codigo AR del producto: ");
    x = scan.nextLine();
		return x;
	}




}