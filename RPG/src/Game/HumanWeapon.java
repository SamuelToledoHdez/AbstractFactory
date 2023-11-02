package Game;

import java.util.Random;

public class HumanWeapon extends Weapon {
    HumanWeapon(){
        Random random = new Random();
        dano = random.nextInt(100) + 1;
        robo = random.nextInt(100) + 1;
    }
}
