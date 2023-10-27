public class MagicFactory extends AbstractFactory{
    public Weapon weaponBuild(){
        return new MagicWeapon();
    }
    public Token tokenBuild(){
        return new MagicToken();
    }
    public Creatures creatureBuild(){
        return new MagicCreature();
    }
}
