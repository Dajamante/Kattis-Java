import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int testCases = in.nextInt();
        int[] shops = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            shops[i] = in.nextInt();
        }

        Arrays.stream(shops)
                .max().orElseThrow(NoSuchElementException::new);
        Integer min = Arrays.stream(shops)
                .min().orElseThrow(NoSuchElementException::new);
        System.out.println((max - min) * 2);

        //just a test for sums
        int sum = Arrays.stream(shops).limit(testCases).sum();
        System.out.println(sum);

    }
}

