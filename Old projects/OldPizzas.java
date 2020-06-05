public class Main {

    public static void main(String[] args) throws java.io.IOException {
        InputReader in = new InputReader();
        double bigRadius = in.nextDouble();
        double crust = in.nextDouble();

        double smallRadius = bigRadius - crust;

        double ratio = ratio(smallRadius, bigRadius);

        System.out.println(ratio);
    }

    public static double ratio(double smallRadius, double bigRadius) {
        return (Math.pow(smallRadius, 2) / Math.pow(bigRadius, 2) * 100);
    }
}