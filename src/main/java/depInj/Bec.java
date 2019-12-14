package depInj;

public class Bec {

    private int energyLevel = 0;

    public Bec (Energy myEnergy){
        energyLevel = myEnergy.giveEnergy();
    }

    public void aprinde(){
        if(energyLevel > 5){
            System.out.println("ne aprindem");
        } else {
            System.out.println("nu ne aprindem");
        }
    }
}
