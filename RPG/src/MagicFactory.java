public class MagicFactory extends AbstractFactory{
    public Weapon weaponBuild(){
        return new MagicWeapon();
    }
    public Token tokenBuild(double cantidad){
        return new MagicToken(cantidad);
    }
    public Creatures creatureBuild(double vidas){
        return new MagicCreature(vidas);
    }
}
