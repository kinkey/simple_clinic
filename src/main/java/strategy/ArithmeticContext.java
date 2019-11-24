package strategy;

public class ArithmeticContext {

    private ArithmeticStrategy strategy;

    public ArithmeticContext(ArithmeticStrategy strategy) {
        this.strategy = strategy;
    }

    public ArithmeticContext() {
    }

    public void setStrategy(ArithmeticStrategy strategy) {
        this.strategy = strategy;
    }

    public void doOperation(int firstParam, int secondParam) {
        System.out.println("Using : " + strategy.getClass().toString());


        int calculatedValue = strategy.doOperation(firstParam, secondParam);
        System.out.println(
                "Our calculated value from the operation is " + calculatedValue);
    }
}
