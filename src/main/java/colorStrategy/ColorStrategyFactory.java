package colorStrategy;

public class ColorStrategyFactory {

    public static ColorStrategy get(String color) {
        switch (color) {
            case "red":
                System.out.println("Choosing red strategy");
                return new RedColorStrategy();
            case "blue":
                System.out.println("Choosing blue strategy");
                return new BlueColorStrategy();
            case "green":
                System.out.println("Choosing green strategy");
                return new GreenColorStrategy();
            case "black":
                System.out.println("Choosing black strategy");
                return new BlackColorStrategy();
            case "pink":
                System.out.println("Choosing pink strategy");
                return new PinkColorStrategy();
        }
        throw new IllegalArgumentException("No such color present");
    }
}
