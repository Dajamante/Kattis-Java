import java.util.*;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        LinkedList <Integer> list = new LinkedList<>();
        ListIterator <Integer> it = list.listIterator(0);

        InputReader in = new InputReader();
        int counter = 0;


        int pairSocks = in.nextInt();
        for (int i = 0; i < pairSocks * 2; i++) {
            list.add(in.nextInt());
        }

        while (it.hasNext()) {
            Integer current = it.next();
            if (it.hasNext() && current.equals(it.next())) {
                it.remove();
                list.remove(current);
                counter++;
            }

        }
        if (!list.isEmpty()) {
            System.out.println("impossible");
        } else {
            System.out.println(counter);
        }

    }

}