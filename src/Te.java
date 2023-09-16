public class Te implements Bebida {
    @Override
    public String getDescripcion() {
        return "Té";
    }

    @Override
    public double costo() {
        return 5.0; // Precio base del té
    }
}
