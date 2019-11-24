package strategy;

public class DivideStrategy implements ArithmeticStrategy {
    @Override
    public int doOperation(int firstParam, int secondParam) {
        return firstParam / secondParam;
    }
}
