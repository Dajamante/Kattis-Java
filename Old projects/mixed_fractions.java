import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            if (a == 0 && b == 0)
                break;
            long plain = a / b;
            long rest = a % b;


            System.out.println(plain + " " + rest + " / "+ b);
        }
    }

}