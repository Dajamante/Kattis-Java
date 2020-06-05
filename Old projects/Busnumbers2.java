import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Kattio io = new Kattio(System.in);


        int numberOfBuses = io.getInt();
        int[] busses = new int[numberOfBuses];

        for (int i = 0; i < numberOfBuses; i++) {
            busses[i] = io.getInt();
        }

        System.out.println(sortBusses(busses));
    }

    public static String sortBusses(int... busses) {
        StringBuilder sb = new StringBuilder();

        if (busses.length == 0)
            return "";

        if (busses.length == 1)
            return Integer.toString(busses[0]);

        Arrays.sort(busses);

        if (busses.length == 2)
            return sb.append(busses[0]).append(" ").append(busses[1]).toString();

        boolean allConsecutive = true;
        for (int j = 0; j < busses.length - 1; j++) {
            if (busses[j] != busses[j + 1] - 1) {
                allConsecutive = false;
            }
        }
        if (allConsecutive)
            return sb.append(busses[0]).append("-").append(busses[busses.length - 1]).toString();


        int start = 0;

        for (int i = start + 1; i < busses.length - 1; i++) {
            if (busses[i] != busses[i+1] - 1) {
                sb.append((i - start > 1) ? (busses[start] + "-" + busses[i] + " ") : (busses[start] + " " + busses[i] + " "));
                start = i + 1;
            }
        }

        if (busses[busses.length - 3] + 1 == busses[busses.length - 2] && busses[busses.length - 2] + 1 == busses[busses.length - 1])
            sb.append("-" + busses[busses.length - 1]);
        else {
            sb.append(busses[busses.length - 1]);
        }

        return sb.toString();
    }

}