package strategy;

public class SubtractStrategy implements ArithmeticStrategy {
    @Override
    public int doOperation(int firstParam, int secondParam) {
        return firstParam - secondParam;
    }
}
