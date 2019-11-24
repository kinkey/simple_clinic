package colorStrategy;

public class ColorContext {

    ColorStrategy colorStrategy;

    public ColorContext(ColorStrategy colorStrategy) {
        this.colorStrategy = colorStrategy;
    }

    public void doOperation(){
        System.out.println("Using : " + colorStrategy.getClass().toString());

        colorStrategy.draw();
    }
}
