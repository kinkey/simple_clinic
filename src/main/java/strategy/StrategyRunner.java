package strategy;

import java.util.Scanner;

public class StrategyRunner {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        String operatiune = myscanner.nextLine();


        ArithmeticContext arithmeticContext = new ArithmeticContext();

        ArithmeticStrategy strategy = ArithmeticStrategyFactory.get(operatiune);

        arithmeticContext.setStrategy(strategy);


        arithmeticContext.doOperation(2,2);
    }
}
