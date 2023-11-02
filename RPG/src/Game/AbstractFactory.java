public abstract class AbstractFactory {
    public abstract Weapon weaponBuild(double dano,double robo);
    public abstract Token tokenBuild(double cantidad);
    public abstract Creatures creatureBuild(double vidas);

}
