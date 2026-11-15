public class Ave implements volador,Cantante{
    public String especie;
    public Ave(String especie){
        this.especie = especie;
    }
    @Override
    public void volar(){
        System.out.println("El ave de especie" + especie + "está volando alto en el cielo");
    }
    @Override
    public void cantar(){
        System.out.println("El ave está cantando una melodía matutina");
    }
}
