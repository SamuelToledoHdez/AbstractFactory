package Game;
public class HumanFactory extends AbstractFactory{
    public Weapon weaponBuild(double a, double b){
        return new HumanWeapon(a,b);
    }
    public Token tokenBuild(double cantidad){
        return new HumanToken(cantidad);
    }
    public Creatures creatureBuild(double vidas){
        return new HumanCreature(vidas);
    }
}
