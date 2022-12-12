package Singleton;

public class TestSingleton {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();

        System.out.println(instance);

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance2);

//      instance == instance2 because of the Singleton Pattern
        System.out.println(instance == instance2);

    }
}
