public class rectangulo extends figura {
    public double base;
    public double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura; //
    }
}
