public class MainFigura {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE CLASES ABSTRACTAS (FIGURAS)");

        // Nota: Si intentas hacer 'Figura f = new Figura();' el compilador dará error
        // ya que las clases abstractas no se pueden instanciar directamente.

        // Usamos polimorfismo:
        figura Circulo = new Circulo(5.0);
        figura Rectangulo = new Rectangulo(4.0, 6.0);

        System.out.print("Círculo -> ");
        Circulo.mostrarArea(); // Invoca el método concreto que a su vez usa el cálculo del círculo

        System.out.print("Rectángulo -> ");
        Rectangulo.mostrarArea(); // Invoca el método concreto que usa el cálculo del rectángulo
    }
}
