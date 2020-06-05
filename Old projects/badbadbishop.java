import java.util.Scanner;


public class Main {
    class Point {
        public int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        scan.nextLine();  // Consume newline left-over


        for (int i = 0; i < tests; i++) {
            char[] line = scan.nextLine().replaceAll("\\s+", "").toCharArray();
            Point start = new Main(). new Point(line[0] - 65, line[1] - 48);
            int x1 = line[0] - 65;
            int y1 = line[1] - 48;
            int x2 = line[2] - 65;
            int y2 = line[3] - 48;


            if ((x1 + y1) == (x2 + y2) || (x1 - y1) == (x2 - y2)) {

                System.out.println(0 + " " + (char) ('A' + x1) + " " + y1);

            } else if (((y1 + x1) % 2 == 0 && (y2 + x2) % 2 != 0) || ((y1 + x1) % 2 != 0 && (y2 + x2) % 2 == 0)) {

                System.out.println("Impossible");

            } else {
                int x = ((y1 + x1) - (y2 - x2)) / 2;
                int y;

                if (x < 0) {
                    x = ((y2 + x2) - (y1 - x1)) / 2;
                    y = x + (y1 - x1);

                } else {
                    y = x + (y2 - x2);

                }
                System.out.println(2 + " " + (char) ('A' + x1) + " " + y1 + " " + (char) ('A' + x) + " " + y + " " + (char) ('A' + x2) + " " + y2);
            }

        }

        scan.close();
    }

}


