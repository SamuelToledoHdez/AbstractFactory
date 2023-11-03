package Game;

import java.util.Random;

public class MagicToken extends Token{

    MagicToken(){
        Random random = new Random();
        cantidad = random.nextInt(100) + 1;

    }
}
