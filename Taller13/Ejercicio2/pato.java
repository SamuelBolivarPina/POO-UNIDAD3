public class pato implements volador,nadador{
    public String nombre;
    public pato(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void volar() {
        System.out.println("El pato " + nombre + " está volando bajo hacia el lago.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato " + nombre + " está nadando tranquilamente en el agua.");
    }
}
