public abstract class AbstractFactory {
    public abstract Weapon weaponBuild();
    public abstract Token tokenBuild(double cantidad);
    public abstract Creatures creatureBuild(double vidas);

}
