package Taller11.ejercicio2;
public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE CLASES ABSTRACTAS (EMPLEADOS) ---");

        // Usamos polimorfismo con la clase abstracta Empleado:
        Taller11.ejercicio2.Empleado emp1 = new Taller11.ejercicio2.Gerente("Carlos Pérez", 3000.0, 1200.0);
        Taller11.ejercicio2.Empleado emp2 = new Taller11.ejercicio2.Vendedor("Ana Gómez", 1500.0, 600.0);

        emp1.mostrardetalles(); // Calcula y muestra los detalles del Gerente
        emp2.mostrardetalles(); // Calcula y muestra los detalles del Vendedor
    }
}
