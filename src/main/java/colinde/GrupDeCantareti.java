package colinde;

import java.util.List;

public class GrupDeCantareti<T extends Colindator> {

    private List<T> colindatorList;

    public GrupDeCantareti(List<T> colindatorList) {
        this.colindatorList = colindatorList;
    }

    public void cantaInGrup(Colind colindulMeu){
        for(T mamaliga : colindatorList){
            mamaliga.cantaColind(colindulMeu);
        }
    }
}
