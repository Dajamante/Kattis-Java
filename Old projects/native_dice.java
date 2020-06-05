import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();
        int[] results = new int[dice1 * dice2];
        int[] repetitions = new int[dice1 * dice2];
        int max = 0;
        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                results[(i - 1) * dice2 + (j - 1)] = i + j;
                repetitions[i + j] += 1;
                if (repetitions[i + j] > max) {
                    max = repetitions[i + j];
                }
            }
        }
        Arrays.sort(results);
        System.out.println(max);
        //do not sort! the indexing will be wrogn
        //Arrays.sort(repetitions);

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < repetitions.length; i++) {
            if (repetitions[i] == max)
                System.out.print(" i :" + i + ", Repetitions i: " + repetitions[i] + " .");
        }
    }
}