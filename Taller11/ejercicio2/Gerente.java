public class Gerente extends Empleado {
    public double bono;

    public Gerente(String nombre, double salarioBase, double bono){
        super(nombre,salarioBase);
        this.bono = bono;
    }
    @Override
    public double calcularSalario(){
        return salarioBase + bono;
    }
}
