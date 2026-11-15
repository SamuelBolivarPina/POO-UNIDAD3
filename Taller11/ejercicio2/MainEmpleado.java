public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE CLASES ABSTRACTAS (EMPLEADOS) ---");

        // Usamos polimorfismo con la clase abstracta Empleado:
        Empleado emp1 = new Gerente("Carlos Pérez", 3000.0, 1200.0);
        Empleado emp2 = new Vendedor("Ana Gómez", 1500.0, 600.0);

        emp1.mostrarDetalles(); // Calcula y muestra los detalles del Gerente
        emp2.mostrarDetalles(); // Calcula y muestra los detalles del Vendedor
    }
}
