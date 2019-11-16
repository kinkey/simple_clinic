package clinic;

public class HumanClinic extends AbstractClinic {

    public HumanClinic(AbstractPatient[] currentPatients) {
        super(currentPatients);
    }

    public void takeInPatient(AbstractPatient newPatient) {
        for (int i = 0; i < currentPatients.length; i++) {
            if (currentPatients[i] == null){
                currentPatients[i] = newPatient;
                break;
            }
        }

    }

    public void releasePatient(AbstractPatient existingPatient) {
        for (int i = 0; i < currentPatients.length; i++) {
            if (currentPatients[i] == existingPatient){
                currentPatients[i] = null;
            }
        }
    }

    public void listPatients() {
        for (int i = 0; i < currentPatients.length; i++) {
           if (currentPatients[i] != null){
                System.out.println(i + " " + currentPatients[i]);
            }
        }
    }


}
