public abstract class VehiculoAbstracto {
    protected String marca;

    public VehiculoAbstracto(String marca) {
        this.marca = marca;
    }

    // Método abstracto obligatorio
    public abstract void encender();
}
