//11. Create an interface with static final variable

interface Config {
    static final int MAX = 10;
}

public class StaticFinalInterface {
    public static void main(String[] args) {
        System.out.println("MAX = " + Config.MAX);
    }
}
