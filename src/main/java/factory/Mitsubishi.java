package factory;

public class Mitsubishi implements Car {
    public Mitsubishi() {
        System.out.println("Creating an instance of a Mitsubishi");

    }

    @Override
    public void drive() {
        System.out.println("Driving a Mitsubishi");
    }
}
