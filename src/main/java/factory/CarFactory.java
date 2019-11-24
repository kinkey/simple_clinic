package factory;

public class CarFactory {

    public static Car get(CarBrand brand){

        switch (brand){
            case LOGAN:
                doSomethingSpecial();
                System.out.println("Attempting to create a new Logan");
                return new Logan();
            case MITSUBISHI:
                System.out.println("Attempting to create a new Mitsubishi");
                return new Mitsubishi();
            case TOYOTA:
                System.out.println("Attempting to create a new Toyota");
                return new Toyota();
        }
        return null;
    }

    public static void doSomethingSpecial(){
        System.out.println("doing something special");
    }
}
