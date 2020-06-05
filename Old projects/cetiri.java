import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();
        int[] tal = in.nextIntArray(3);

        Arrays.sort(tal);

        System.out.println(((tal[1] - tal[0] < tal[2] - tal[1]) ? tal[1] + (tal[1] - tal[0]) :
                ((tal[1] - tal[0] > tal[2] - tal[1]) ? tal[0] + (tal[2] - tal[1]) : tal[2] + (tal[2] - tal[1]))));


    }
}