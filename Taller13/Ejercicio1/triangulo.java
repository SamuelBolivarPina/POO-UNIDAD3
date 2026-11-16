public class triangulo extends figura {
    public double base;
    public double altura;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return (base * altura) / 2.0;
    }
}
