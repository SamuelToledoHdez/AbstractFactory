package Game;

public class MagicFactory extends AbstractFactory{
    public Weapon weaponBuild(double dano, double robo){
        return new MagicWeapon(dano,robo);
    }
    public Token tokenBuild(double cantidad){
        return new MagicToken(cantidad);
    }
    public Creatures creatureBuild(double vidas){
        return new MagicCreature(vidas);
    }
}
