public class ChocolateDecorator extends DecoradorIngredientes {
    public ChocolateDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    @Override
    public double costo() {
        return bebida.costo() + 3.0; // Precio del chocolate
    }
}
