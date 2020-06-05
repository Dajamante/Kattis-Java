import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("dk", "DK"));

        Kattio io = new Kattio(System.in);

        while (true) {
            double horizontal = io.getDouble();
            double vertical = io.getDouble();
            double seconds = io.getDouble();
            double verticalBounce = io.getDouble();
            double horizontalBounce = io.getDouble();

            if (horizontal == 0 && vertical == 0 && seconds == 0 && verticalBounce == 0 && horizontalBounce == 0) {
                break;
            }

            double katetOne = horizontal * verticalBounce;
            double katetTwo = vertical * horizontalBounce;

            double tangens = Math.atan(katetTwo / katetOne);
            double angle = Math.toDegrees(tangens);


            double distance = Math.sqrt(Math.pow(katetOne, 2) + Math.pow(katetTwo, 2));
            double speed = (distance / seconds);

            System.out.printf("%.2f", angle);
            System.out.print(" ");
            System.out.printf("%.2f \n", speed);
        }

    }
}

