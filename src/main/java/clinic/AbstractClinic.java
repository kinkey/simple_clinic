package clinic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractClinic {

    public AbstractClinic(AbstractPatient[] currentPatients) {
        this.currentPatients = currentPatients;
    }

    protected AbstractPatient[] currentPatients;
    protected int[] numbers;
    protected String[] strings;
    List<String> myArray = new ArrayList<>();
    List<Integer> array2 = new ArrayList<>();

    // k : int, v: AbstractPatient
    Map<Integer, AbstractPatient> clinic = new HashMap<>();

    public abstract void takeInPatient(AbstractPatient newPatient);

    public abstract void releasePatient(AbstractPatient newPatient);

    public abstract void listPatients();

    public AbstractPatient[] getCurrentPatients(){
        return currentPatients;
    }

}
