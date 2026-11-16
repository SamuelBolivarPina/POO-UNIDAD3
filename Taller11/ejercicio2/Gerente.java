package Taller11.ejercicio2;
public class Gerente extends Taller11.ejercicio2.Empleado {
    public double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase); // Llama al constructor de la clase padre
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
