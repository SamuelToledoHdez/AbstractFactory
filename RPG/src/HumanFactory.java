public class HumanFactory extends AbstractFactory{
    public Weapon weaponBuild(){
        return new HumanWeapon();
    }
    public Token tokenBuild(double cantidad){
        return new HumanToken(cantidad);
    }
    public Creatures creatureBuild(double vidas){
        return new HumanCreature(vidas);
    }
}
