public class MainErrorAbstracto {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE ERROR EN CLASE ABSTRACTA ---");

        // ERROR DE COMPILACIÓN:
        // Si intentas descomentar la siguiente línea, Java te arrojará un error
        // indicando que "VehiculoAbstracto is abstract; cannot be instantiated".
        //VehiculoAbstracto v = new VehiculoAbstracto("Toyota");

        System.out.println("Las clases abstractas sirven como plantillas base y no se pueden instanciar directamente con 'new'.");
    }
}
