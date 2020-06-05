import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            long n = scan.nextInt();
            if(n == 0)
                break;

            for (int i = 11; i < 101; i++) {
                long n2 = i * n;
                if (doDigitSum(n2) == doDigitSum(n)) {
                    System.out.println(i);
                    break;
                }

            }
        }
    }

    private static int doDigitSum(long n) {
        int sumDigits = 0;
        while (n > 0) {
            sumDigits += n % 10;
            n = n / 10;
        }

        return sumDigits;
    }
}

