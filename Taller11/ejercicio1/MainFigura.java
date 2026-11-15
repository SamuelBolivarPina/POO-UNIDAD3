public class MainFigura {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE CLASES ABSTRACTAS (FIGURAS)");

        // Nota: Si intentas hacer 'Figura f = new Figura();' el compilador dará error
        // ya que las clases abstractas no se pueden instanciar directamente.

        // Usamos polimorfismo:
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.print("Círculo -> ");
        circulo.mostrarArea(); // Invoca el método concreto que a su vez usa el cálculo del círculo

        System.out.print("Rectángulo -> ");
        rectangulo.mostrarArea(); // Invoca el método concreto que usa el cálculo del rectángulo
    }
}
