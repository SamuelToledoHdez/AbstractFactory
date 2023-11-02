package Game;

public abstract class AbstractFactory {
    public abstract Weapon weaponBuild();
    public abstract Token tokenBuild();
    public abstract Creatures creatureBuild();

}
