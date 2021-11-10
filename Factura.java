abstract class Factura
{
  
  public Factura( int NIT, String fecha, String cliente, int NuFactura, double montoTotal){
    this.NIT = NIT;
    this.fecha = fecha;
    this.cliente = cliente;
    this.NuFactura = NuFactura;
    this.montoTotal = montoTotal;
  }

  protected int NIT;
  protected String fecha; 
  protected String cliente;
  protected int NuFactura;
  protected double montoTotal;
}
