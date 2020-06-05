import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in);

        int numberOfBusses = io.getInt();

        int[] busses = new int[numberOfBusses];

        for (int i = 0; i < numberOfBusses; i++)
            busses[i] = io.getInt();


        Arrays.sort(busses);
        int first = 0;

        while (first < busses.length) {

            //find the index of the array for which we need to stop.
            //OBS! if one bus is isolated from a group (ex : busses = 1 4 5 6), the index returns the number
            //itself, that is to say 0.
            int last = returnLastIndex(first, busses);

            if (first != last) {
                //this method will return a char '-' or ' ', depending on the steps between busses[first] and
                //busses[last]
                char separator = returnSeparator(first, last);

                //print a pair of busses with the right separator, '-' or ' '
                System.out.print(busses[first] + Character.toString(separator) + busses[last]);

                //if we are NOT printing out the last bus, we need a space after busses[last]
                if (last != busses.length - 1)
                    System.out.print(" ");

                //if first == last, that is to say, if we are at the end of the array OR if the method returned a
                //bus isolated from a group (ex : returnLastIndex for busses [1 4 5 6] will return 0, since busses[0] (1) is
                //isolated from 4, 5 and 6
            } else {
                System.out.print(busses[first]);
                //if it's not the last bus, we need a space after it.
                if (first != busses.length - 1)
                    System.out.print(" ");
            }

            first = last + 1;
        }


    }


    /**
     * Method to print a dash or a space between two busses, depending on if they are consecutive
     *
     * @param first
     * @param last
     * @return separator '-' or ' '
     */
    private static char returnSeparator(int first, int last) {
        char sep;
        if (last - first == 1)
            sep = ' ';
        else
            sep = '-';
        return sep;
    }


    /**
     * Method to check if busses are consecutive in the array.
     *
     * @param first
     * @param busses
     * @return
     */
    private static int returnLastIndex(int first, int... busses) {
        int increment = 1;
        int last = first + 1;

        while (last < busses.length) {
            if (busses[first] == busses[last] - increment) {
                last++;
                increment++;
            } else
                break;
        }
        return last - 1;
    }

}
