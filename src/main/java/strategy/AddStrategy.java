package strategy;

public class AddStrategy implements ArithmeticStrategy {

    @Override
    public int doOperation(int firstParam, int secondParam) {
        return firstParam + secondParam;
    }
}
