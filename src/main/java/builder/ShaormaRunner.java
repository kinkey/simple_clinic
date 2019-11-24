package builder;

public class ShaormaRunner {

    public static void main(String[] args) {
        Shaorma cuDeToate =
                Shaorma.newShaorma().cuMaioneza(true).cuMaioneza(true).cuMaioneza(false)
                        .build();

        System.out.println(cuDeToate);


    }
}
