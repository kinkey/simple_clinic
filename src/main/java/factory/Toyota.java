package factory;

public class Toyota implements Car  {

    public Toyota() {
        System.out.println("Creating an instance of a Toyota");

    }

    @Override
    public void drive() {
        System.out.println("Driving a Toyota");
    }
}
