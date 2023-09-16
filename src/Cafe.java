public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double costo() {
        return 3.0; // Precio base del café
    }
}
