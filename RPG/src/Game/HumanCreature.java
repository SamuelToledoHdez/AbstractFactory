package Game;

import java.util.Random;

public class HumanCreature extends Creatures {

    HumanCreature(){
        Random random = new Random();
        vida = random.nextInt(100) + 1;
        imagePath = "GIF/HUM.gif";
    }
}
