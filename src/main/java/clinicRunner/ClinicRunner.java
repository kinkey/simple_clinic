package clinicRunner;

import clinic.*;

public class ClinicRunner {

    public static void main(String[] args) {
        AbstractClinic humanClinic = new HumanClinic(new HumanPatient[10]);
        AbstractClinic petClinic = new PetClinic(new PetPatient[10]);


        AbstractPatient salam = new HumanPatient("$alam");
        AbstractPatient vali = new HumanPatient("vali");

        humanClinic.takeInPatient(salam);
        humanClinic.takeInPatient(vali);

        humanClinic.listPatients();

        humanClinic.releasePatient(salam);
        System.out.println("----");
        humanClinic.listPatients();

        AbstractPatient daniMocanu = new HumanPatient("Dani Mocanu");
        System.out.println("adding new patient");
        humanClinic.takeInPatient(daniMocanu);
        System.out.println("++++++");
        humanClinic.listPatients();
    }
}
