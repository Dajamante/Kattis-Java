import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();
        int cases = in.nextInt();

        for (int c = 0; c < cases; c++) {

            String[] ages = in.nextLine().split("\\s+");
            int[] numbers = new int[ages.length - 1];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(ages[i]);
            }
            int sum = 0;

            for (int i = 0; i < numbers.length - 1; i++) {
                if ((numbers[i + 1] > numbers[i] * 2))
                    sum += (numbers[i + 1] - numbers[i] * 2);
            }
            System.out.print((c != cases - 1) ? sum + "\n" : sum);
        }

    }
}


