import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        scan.nextLine();  // Consume newline left-over


        for (int i = 0; i < tests; i++) {
            char[] line = scan.nextLine().replaceAll("\\s+", "").toCharArray();
            int x1 = line[0] - 64;
            int y1 = line[1] - 48;
            int x2 = line[2] - 64;
            int y2 = line[3] - 48;


            if (x1 == x2 && y1 == y2) {

                System.out.println(0 + " " + (char) ('@' + x1) + " " + y1);

            } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {

                System.out.println(1 + " " + (char) ('@' + x1) + " " + y1 + " "+ (char) ('@' + x2) + " " + y2);

            } else if ((Math.abs(x1 + y1) % 2) != (Math.abs(x2 + y2) % 2)) {

                System.out.println("Impossible");

            } else {
                int x = ((y1 + x1) - (y2 - x2)) / 2;
                int y = x + (y2 - x2);

                if (x < 1 || x > 8 || y < 1 || y > 8) {
                    x = ((y2 + x2) - (y1 - x1)) / 2;
                    y = x + (y1 - x1);
                }

                System.out.println(2 + " " + (char) ('@' + x1) + " " + y1 + " " +
                        (char) ('@' + x) + " " + y + " " + (char) ('@' + x2) + " " + y2);
            }

        }
    }

}

