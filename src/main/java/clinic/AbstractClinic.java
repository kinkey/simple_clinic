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

    public abstract void takeInPatient(AbstractPatient newPatient);

    public abstract void releasePatient(AbstractPatient newPatient);

    public abstract void listPatients();

    public AbstractPatient[] getCurrentPatients(){
        return currentPatients;
    }

}
