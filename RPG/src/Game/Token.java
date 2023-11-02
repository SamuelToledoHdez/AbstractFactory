package Game;
public abstract class Token {
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    protected double cantidad;
}
