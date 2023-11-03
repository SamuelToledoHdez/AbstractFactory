package Game;

import java.util.Random;

public class MagicWeapon extends Weapon {

    MagicWeapon(){
        Random random = new Random();
        dano = random.nextInt(100) + 1;
        robo = random.nextInt(100) + 1;
    }
}
