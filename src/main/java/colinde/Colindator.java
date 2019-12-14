package colinde;

public class Colindator extends Cantaret{

    Integer x =5 ;
    public Colindator(String numeColindator) {
        this.numeColindator = numeColindator;
    }

    public String getNumeColindator() {
        return numeColindator;
    }

    public void cantaColind(Colind colindDeCantat){
        System.out.println("Colindatorul : " + numeColindator +
                " canta : " + colindDeCantat.getNumeColind());
    }


    public static void bla(){
       // int a = x;
    }

}
