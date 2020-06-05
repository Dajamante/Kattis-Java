import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();

        while (true) {
            int points = in.nextInt();
            if (points == 0) {
                break;
            }

            ArrayList<Integer> xCoordinates = new ArrayList<>();
            ArrayList<Integer> yCoordinates = new ArrayList<>();


            for (int i = 0; i < points; i++) {
                xCoordinates.add(in.nextInt());
                yCoordinates.add(in.nextInt());
            }

            xCoordinates.add(xCoordinates.get(0));
            yCoordinates.add(yCoordinates.get(0));

            double area = 0;
            for (int i = 0; i < points; i++) {
                area += (xCoordinates.get(i) * yCoordinates.get(i + 1) - yCoordinates.get(i) * xCoordinates.get(i + 1));
            }


            System.out.print((area < 0) ? "CW " : "CCW ");
            String areaString = String.format(Locale.ROOT, "%.1f", Math.abs(area / 2));
            System.out.println(areaString);

        }
    }
}