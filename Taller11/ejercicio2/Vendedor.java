package Taller11.ejercicio2;
public class Vendedor extends Taller11.ejercicio2.Empleado { // <--- Cambiado a Empleado
    public double comisionVenta;

    public Vendedor(String nombre, double salarioBase, double comisionVenta) {
        super(nombre, salarioBase);
        this.comisionVenta = comisionVenta;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comisionVenta;
    }
}
