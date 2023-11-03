package Game;

public abstract class Creatures {
    public double getVida() {
        return vida;
    }
    protected String imagePath;

    public void setVida(double vida) {
        this.vida = vida;
    }

    protected double vida;
    public String getImagePath() {
        return imagePath;
    }
}
