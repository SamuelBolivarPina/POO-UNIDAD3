package Taller13.Ejercicio2;
public class Pato implements Taller13.Ejercicio2.volador, Taller13.Ejercicio2.nadador {
    public String nombre;
    public Pato(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void Volar() {
        System.out.println("El pato " + nombre + " está volando bajo hacia el lago.");
    }

    @Override
    public void Nadar() {
        System.out.println("El pato " + nombre + " está nadando tranquilamente en el agua.");
    }
}
