public class CanelaDecorator extends DecoradorIngredientes {
    public CanelaDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Canela";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.5; // Precio de la canela
    }
}
