package clinic;

public abstract class AbstractPatient {

    protected String name;

    public AbstractPatient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbstractPatient{" +
                "name='" + name + '\'' +
                '}';
    }
}
