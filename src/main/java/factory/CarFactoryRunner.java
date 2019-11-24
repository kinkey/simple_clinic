package factory;

public class CarFactoryRunner {

    public static void main(String[] args) {
       /* System.out.println("Attempting to create a new Logan");
        Car logan = new Logan();

        System.out.println("Attempting to create a new Mitsubishi");
        Car mitsu = new Mitsubishi();*/

       Car logan = CarFactory.get(CarBrand.LOGAN);

       Car mitsu = CarFactory.get(CarBrand.MITSUBISHI);
        //TODO interface Plane. has fly() method. classes : Boeing, Airbus, Cessna
        //TODO print some code in constructors and method implemented from interface.
    }
}
