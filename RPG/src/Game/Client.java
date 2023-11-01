public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();
        factory.weaponBuild();
    }
}
