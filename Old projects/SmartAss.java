import java.io.IOException;
import java.util.Locale;

public class Main {


    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();

        int cases = in.nextInt();

        for (int i = 0; i < cases; i++) {
            int grades = in.nextInt();
            int[] details = in.nextIntArray(grades);

            double sum = 0;
            for (int g : details)
                sum += g;

            double average = sum / grades;

            double numberOfSmartAsses = 0;
            for (int g : details)
                if (g > average)
                    numberOfSmartAsses++;

            String argument = String.format(Locale.ROOT, "%.3f", (numberOfSmartAsses / grades) * 100);
            System.out.printf("%s%%\n", argument);

        }

    }
}

