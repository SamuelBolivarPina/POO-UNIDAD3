package Taller11.ejercicio1;
public class Rectangulo extends Taller11.ejercicio1.Figura {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return base * altura;
    }
}
