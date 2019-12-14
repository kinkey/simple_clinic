package singleton;

public class SimpleSingleton {


    private static SimpleSingleton instance;

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void saySomething(String something){
        System.out.println("I'm saying " + something);
    }
}
