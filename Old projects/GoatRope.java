import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        double xPost = in.nextDouble();
        double yPost = in.nextDouble();
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        if (xPost >= x1 && xPost <= x2) {
            //System.out.println("The x alignment is klurrig!");
            System.out.println(Math.min(Math.abs(yPost - y1), Math.abs(yPost - y2)));
        } else if (yPost >= y1 && yPost <= y2) {
            //System.out.println("The y alignment is klurrig!");
            System.out.println(Math.min(Math.abs(xPost - x1), Math.abs(xPost - x2)));

        } else {
            double cornerOne = Math.sqrt(Math.abs(Math.pow((xPost - x1), 2) + Math.pow((yPost - y1), 2)));
            double cornerTwo = Math.sqrt(Math.abs(Math.pow((xPost - x1), 2) + Math.pow((yPost - y2), 2)));
            double cornerThree = Math.sqrt(Math.abs(Math.pow((xPost - x2), 2) + Math.pow((yPost - y1), 2)));
            double cornerFour = Math.sqrt(Math.abs(Math.pow((xPost - x2), 2) + Math.pow((yPost - y2), 2)));

            double minDistance = Double.min(Double.min(cornerOne, cornerTwo), Double.min(cornerThree, cornerFour));


            /*
            System.out.printf((Locale) null, "Distance to corner one x1,y1 %.3f \n", Math.sqrt(cornerOne));
            System.out.printf((Locale) null, "Distance to corner two x1,y2 %.3f \n", Math.sqrt(cornerTwo));
            System.out.printf((Locale) null, "Distance to corner three x2,y1 %.3f \n", Math.sqrt(cornerThree));
            System.out.printf((Locale) null, "Distance to corner four x2,y2 %.3f \n", Math.sqrt(cornerFour));
            */

            //System.out.printf((Locale) null, "Shortest distance = %.3f", minDistance);
            System.out.println(minDistance);
        }
    }

}




