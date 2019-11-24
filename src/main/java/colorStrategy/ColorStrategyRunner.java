package colorStrategy;

import java.util.Scanner;

public class ColorStrategyRunner {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        String culoare = myscanner.nextLine();

        ColorStrategy myColorStrategy = ColorStrategyFactory.get(culoare);

        ColorContext context = new ColorContext(myColorStrategy);

        context.doOperation();
    }
}
