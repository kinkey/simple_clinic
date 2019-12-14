package strategy;

public class SingletonRunner {

    public static void main(String[] args) {
        Telephone instance = Telephone.getInstance();

        System.out.println(instance);

        Telephone instance2 = Telephone.getInstance();

        System.out.println(instance2);
    }
}
