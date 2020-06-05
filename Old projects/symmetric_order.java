import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break;

            String[] names = new String[n];

            for (int i = 0; i < n; i++) {
                names[i] = scanner.next();
            }

            String[] namesCopy = addingNames(names, n);
            System.out.println("SET "+ count);
            for (String name : namesCopy)
                System.out.println(name);
            count++;
        }

    }

    public static String[] addingNames(String[] names, int n) {

        String[] namesCopy = new String[n];
        int i = 0;
        int counter = 0;
        while (i < n) {
            namesCopy[counter] = names[i];
            i++;
            if (i == n || i > n)
                break;
            namesCopy[n - 1 - counter] = names[i];
            i++;
            counter++;
            if (i == n || i > n)
                break;
        }

        return namesCopy;
    }

}