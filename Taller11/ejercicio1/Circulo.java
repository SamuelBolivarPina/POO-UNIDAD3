package Taller11.ejercicio1;
public class Circulo extends Taller11.ejercicio1.Figura {
    public double radio;

    public Circulo(double radio){

        this.radio = radio;
    }
    @Override
    public double calcularArea() {

        return Math.PI * radio * radio;
    }
}
