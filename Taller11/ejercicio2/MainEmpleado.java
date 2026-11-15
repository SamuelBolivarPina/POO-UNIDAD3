public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE CLASES ABSTRACTAS (EMPLEADOS) ---");

        // Usamos polimorfismo con la clase abstracta Empleado:
        EmpleadoAbstracto emp1 = new Gerente("Carlos Pérez", 3000.0, 1200.0);
        EmpleadoAbstracto emp2 = new Vendedor("Ana Gómez", 1500.0, 600.0);

        emp1.mostrardetalles(); // Calcula y muestra los detalles del Gerente
        emp2.mostrardetalles(); // Calcula y muestra los detalles del Vendedor
    }
}
