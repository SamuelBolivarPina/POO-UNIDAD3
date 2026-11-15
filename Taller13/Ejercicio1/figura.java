public abstract class figura {
    // Método abstracto que obliga a las subclases a definir su propio cálculo de área
    public abstract double calcularArea();

    // Método concreto compartido por las figuras
    public void mostrarfigura() {
        System.out.println("El área calculada es: " + calcularArea());
    }
}
