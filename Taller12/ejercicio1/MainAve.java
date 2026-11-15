public class MainAve {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE HERENCIA MÚLTIPLE: CLASE AVE ---");

        Ave miAve = new Ave("Canario");

        // Usamos los métodos de ambas interfaces
        miAve.volar();
        miAve.cantar();
    }
}
