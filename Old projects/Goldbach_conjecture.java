import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        Sieve sieve = new Sieve();

        int cases = in.nextInt();

        for (int j = 0; j < cases; j++) {
            StringBuilder sb = new StringBuilder();
            int representations = 0;
            int number = in.nextInt();
            for (int i = 2; i < (number / 2 + 1); ) {
                if (sieve.isPrime(i)) {
                    int rest = number - i;
                    if (sieve.isPrime(rest)) {
                        sb.append(i).append("+").append(rest).append('\n');
                        representations++;
                    }
                }
                i++;


            }

            System.out.printf("%d has %d representation(s)\n", number, representations);
            System.out.println(sb.toString());
        }
    }
}
