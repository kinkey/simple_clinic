package factory;

public class Logan implements Car {

    public Logan() {
        System.out.println("Creating an instance of a Logan");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Logan");
    }
}
