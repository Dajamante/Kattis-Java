import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();
        int k = in.nextInt();
        int n = in.nextInt();

        int fk1 = 42;
        int fk2 = 11* k + 77;
        int fkn = 0;

        for(int i = 0; i < n; i++) {
            fkn = 2 * fk2 - fk1 + 10 * k;
            System.out.println(fkn);
            fk1 = fk2;
            fk2 = fkn;

        }
        System.out.println(fkn);
    }

}



