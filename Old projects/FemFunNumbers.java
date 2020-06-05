public class Main {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int tests = io.getInt();

        for (int i = 0; i < tests; i++) {
            double a = io.getDouble();
            double b = io.getDouble();
            double c = io.getDouble();

            if (c / b == a || c / a == b || a / b == c || b / a == c || a + b == c || a - b == c || b - a == c)
                System.out.println("Possible");
            else
                System.out.println("Impossible");

        }
        io.flush();

    }
}
