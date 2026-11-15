public abstract class Figura {
    // Método abstracto (sin cuerpo, obliga a las clases hijas a implementarlo)
    public abstract double calcularArea();
    // Método concreto que reutiliza el cálculo
    public void mostrarArea() {
        System.out.println("El área calculada es: " + calcularArea());
    }
}
