import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();

        if (dice2 < dice1) {
            int temp = dice1;
            dice1 = dice2;
            dice2 = temp;
        }

        if (dice1 = dice2) {
            System.out.println(dice1 + 1);
        } else {
            for (int i = (dice1 + 1); i < (dice2 + 1); i++)
                System.out.println(i);
        }
    }


}