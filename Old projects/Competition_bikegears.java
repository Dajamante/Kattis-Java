import java.io.IOException;
import java.util.*;

class Pair implements Comparable<Pair> {
    private long front;
    private long back;

    public Pair(long f, long b) {
        this.front = f;
        this.back = b;
    }

    public long getFront() {
        return front;
    }

    public long getBack() {
        return back;
    }

    @Override
    public int compareTo(Pair o) {
        return Long.compare(getFront() * o.getBack(), getBack() * o.getFront());

    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int f = in.nextInt();
        int b = in.nextInt();

        long[] fronts = in.nextLongArray(f);
        long[] backs = in.nextLongArray(b);

        Pair[] pairs = addNewPairs(fronts, backs);

        //Collections implement compareTo
        Collections.sort(Arrays.asList(pairs));

        for (Pair p : pairs)
            System.out.printf("(%d,%d) \n", p.getFront(), p.getBack());
    }


    public static Pair[] addNewPairs(long[] fronts, long[] backs) {

        Pair[] pairs = new Pair[fronts.length * backs.length];
        int index = 0;
        for (int i = fronts.length; i > 0; i--) {
            for (int j = 0; j < backs.length; j++) {
                pairs[index] = new Pair(fronts[i - 1], backs[j]);
                index++;
            }
        }
        return pairs;

    }

}



