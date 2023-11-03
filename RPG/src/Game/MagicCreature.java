package Game;

import java.util.Random;

public class MagicCreature extends Creatures {
    //criatura magica 2
    MagicCreature(){
        Random random = new Random();
        vida = random.nextInt(100) + 1;
        imagePath = "GIF/MAG.gif";
    }
}

