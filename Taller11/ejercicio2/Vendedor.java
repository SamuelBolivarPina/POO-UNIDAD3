public class Vendedor extends Empleado{
    public double comisionVenta;
    public Vendedor (String nombre, double salarioBase,double comisionVenta){
        super (nombre,salarioBase);
        this.comisionVenta = comisionVenta;
    }
}
