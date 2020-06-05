import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();

        int places = in.nextInt();
        int roads = in.nextInt();
        int witnesses = in.nextInt();

        int[] locations = in.nextIntArray(witnesses);

        if (witnesses == 1) {
            System.out.println(processOneLocation(places));
        } else if (locations[0] == 1 && locations[witnesses - 1] == places) {
            System.out.println(0);
        } else
            System.out.println(processLocations(locations, places, witnesses));
    }

    public static String processLocations(int[] locations, int places, int witnesses) {
        Arrays.sort(locations);
        StringBuilder sb = new StringBuilder();
        int count = 0;


        for (int i = 1; i <= locations[0]; i++) {
            sb.append(i).append(" ");
            count++;
        }

        for (int i = locations[witnesses - 1]; i < places; i++) {
            sb.append(i).append(" ");
            count++;
        }
        sb.append(places);
        count++;

        System.out.println(count);

        return sb.toString();
    }

    public static String processOneLocation(int places) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < places; i++) {
            sb.append(i).append(" ");
        }
        sb.append(places);

        System.out.println(places);
        return sb.toString();
    }
}


