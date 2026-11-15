public abstract class Empleado {
    public String nombre;
    public double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();
    public void mostrardetalles(){
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario total calculado: $" + calcularSalario());
        System.out.println("-----------------------------------");
    }
}
