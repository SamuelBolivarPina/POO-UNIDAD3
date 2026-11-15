public class Pez implements Nadador,Respirador{
    public String tipo;

    public Pez(String tipo){
        this.tipo = tipo;
    }
    @Override
    public void nadar(){
        System.out.println("El pez de tipo " + tipo + " está nadando ágilmente en el agua.");
    }
    @Override
    public void respirar(){
        System.out.println("El pez está respirando oxígeno a través de sus branquias bajo el agua.");
    }
}
