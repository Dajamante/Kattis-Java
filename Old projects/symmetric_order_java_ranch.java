import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        InputReader ir = new InputReader();

        LinkedList<String> names = new LinkedList<>();

        int n = ir.nextInt();

        for (int i = 0; i < n; i++) {
            names.add(ir.nextString());
        }

        LinkedList<String> namesCopy = addingNames(names, n);

        System.out.println(namesCopy);

    }

    public static LinkedList<String> addingNames(List<String> names, int n) {

        LinkedList<String> namesCopy = new LinkedList<>();

        for (int ins = 0, i = 0; i < n; i++) {
            namesCopy.add(ins++, names.get(i++));
            if (i < n) {
                namesCopy.add(ins, names.get(i));
                System.out.println(namesCopy);
            }
        }
        return namesCopy;
    }

}