package Taller11.ejercicio1;
public class MainFigura {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE CLASES ABSTRACTAS (FIGURAS)");

        // Nota: Si intentas hacer 'Figura f = new Figura();' el compilador dará error
        // ya que las clases abstractas no se pueden instanciar directamente.

        Taller11.ejercicio1.Figura circulo = new Taller11.ejercicio1.Circulo(5.0);
        Taller11.ejercicio1.Figura rectangulo = new Taller11.ejercicio1.Rectangulo(4.0, 6.0);

        System.out.print("Círculo -> ");
        circulo.mostrarArea(); // Invoca el método concreto que a su vez usa el cálculo del círculo

        System.out.print("Rectángulo -> ");
        rectangulo.mostrarArea(); // Invoca el método concreto que usa el cálculo del rectángulo
    }
}
