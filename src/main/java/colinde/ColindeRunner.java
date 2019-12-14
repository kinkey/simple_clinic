package colinde;

import java.util.ArrayList;
import java.util.List;

public class ColindeRunner {

    public static void main(String[] args) {
        Colind colindulMeu = new Colind("Florile dalbe");

        Colindator adi = new Colindator("Adi Minune");
        Cantaret cantertulMeu = new Colindator("Cantaret mirific");

        adi.cantaColind(colindulMeu);
        cantertulMeu.cantaColind(colindulMeu);
    }
}
