import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        String[] stringArray = in.nextLine().split(" ");
        List<String> listWithoutDuplicates = new ArrayList<>(
                new HashSet<>(Arrays.asList(stringArray)));

        System.out.println((stringArray.length == listWithoutDuplicates.size()) ? "yes" : "no");
    }
}

