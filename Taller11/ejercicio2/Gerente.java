public class Gerente extends EmpleadoAbstracto {
    public double bono;

    public Gerente(String nombre, double salarioBase, double bono){
        super(nombre,salarioBase);
        this.bono = bono;
    }
    @Override
    public void calcularSalario(){

        return salarioBase + bono;
    }
}
