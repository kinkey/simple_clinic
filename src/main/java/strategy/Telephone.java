package strategy;

public class Telephone {

    private static Telephone instance;

    private Telephone() {
    }

    public static Telephone getInstance(){
       if(instance == null){
           instance = new Telephone();
       }

       return instance;
    }
}
