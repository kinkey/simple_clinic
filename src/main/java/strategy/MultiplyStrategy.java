package strategy;

public class MultiplyStrategy implements ArithmeticStrategy {
    @Override
    public int doOperation(int firstParam, int secondParam) {
        return firstParam * secondParam;
    }
}
