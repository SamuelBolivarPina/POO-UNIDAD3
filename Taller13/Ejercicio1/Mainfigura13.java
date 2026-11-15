public class Mainfigura13 {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 13: CLASES ABSTRACTAS ---");

        // Instanciamos usando polimorfismo con la clase abstracta Figura[cite: 27]
        figura rectangulo = new rectangulo(5.0, 3.0);
        figura triangulo = new triangulo(4.0, 6.0);

        System.out.print("Rectángulo -> ");
        rectangulo.mostrarfigura();

        System.out.print("Triángulo -> ");
        triangulo.mostrarfigura();
    }
}
