package strategy;

public class ArithmeticStrategyFactory {

    public static ArithmeticStrategy get(String strategyName) {
        switch (strategyName) {
            case "add":
                return new AddStrategy();
            case "sub":
                return new SubtractStrategy();
            case "mult":
                return new MultiplyStrategy();
            case "div":
                return new DivideStrategy();
        }
        return null;

    }
}
