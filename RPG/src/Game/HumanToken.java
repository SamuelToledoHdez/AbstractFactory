package Game;

import java.util.Random;

public class HumanToken extends Token{

    HumanToken(){
        Random random = new Random();
        cantidad= random.nextInt(100) + 1;

    }
}
