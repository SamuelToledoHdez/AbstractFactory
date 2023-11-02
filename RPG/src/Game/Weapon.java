package Game;

public abstract class Weapon {
    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getRobo() {
        return robo;
    }

    public void setRobo(double robo) {
        this.robo = robo;
    }

    protected double dano;
    protected double robo;
}
