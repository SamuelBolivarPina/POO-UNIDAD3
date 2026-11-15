package Taller13.Ejercicio2;

public class MainPato13 {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 13: INTERFACES (VOLADOR Y NADADOR) ---");

        Taller13.Ejercicio2.Pato pato = new Taller13.Ejercicio2.Pato("Lucas");

        // El pato ejecuta los comportamientos de ambas interfaces
        pato.Volar();
        pato.Nadar();
    }
}
