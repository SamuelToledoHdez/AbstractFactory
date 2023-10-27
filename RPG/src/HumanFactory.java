public class HumanFactory extends AbstractFactory{
    public Weapon weaponBuild(){
        return new HumanWeapon();
    }
    public Token tokenBuild(){
        return new HumanToken();
    }
    public Creatures creatureBuild(){
        return new HumanCreature();
    }
}
