import java.io.IOException;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            int numberOfShops = in.nextInt();

            int[] shops = in.nextIntArray(numberOfShops);

            System.out.println(2 * (Arrays.stream(shops).max().getAsInt() - Arrays.stream(shops).min().getAsInt()));
        }
    }
}


/*
not working!
        int numberOfShops = in.nextInt();

        int[] shops = in.nextIntArray(numberOfShops);
        System.out.println(Collections.max(Arrays.asList(shops)));
        System.out.println(Integer.max(Arrays.asList(shops)));
*/
