import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] binary = new int[(int) Math.ceil(Math.log10(n) / Math.log10(2))];

        for (int i = 0; i < binary.length; i++) {
            binary[i] = n % 2;
            n /= 2;
        }
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < binary.length - 1; i++) {
            if (binary[i] == 1 && binary[i] == binary[i + 1]) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            } else if (binary[i + 1] == 0) {
                count = 0;
            }
        }

        System.out.println(count == 0 ? 1 : maxCount + 1);
    }
}
