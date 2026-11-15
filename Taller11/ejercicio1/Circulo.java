public class Circulo extends figura {
    public double radio;

    public Circulo(double radio){
    this.radio = radio;
    }
    @Override
    public double calcularArea() {
return Math.PI * radio * radio;
    }
}
