public abstract class DecoradorIngredientes implements Bebida {
    protected Bebida bebida;

    public DecoradorIngredientes(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract String getDescripcion();
    public abstract double costo();
}
