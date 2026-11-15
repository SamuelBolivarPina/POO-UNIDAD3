public class MainPez {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE HERENCIA MÚLTIPLE: CLASE PEZ ---");

        Pez miPez = new Pez("Payaso");

        // Usamos los métodos de ambas interfaces
        miPez.nadar();
        miPez.respirar();
    }
}
