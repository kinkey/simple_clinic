package depInj;

import bloc.StaticThing;

public class BecRunner {

    public static void main(String[] args) {
        Energy solar = new SolarEnergy();
        Energy nuclear = new NuclearEnergy();
        Bec myBec = new Bec(nuclear);

        myBec.aprinde();
    }
}
