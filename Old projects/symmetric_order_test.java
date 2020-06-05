import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testRightOrderListOne() {
        int n = 7;
        String names = "Bo\n" +
                "Pat\n" +
                "Jean\n" +
                "Kevin\n" +
                "Claude\n" +
                "William\n" +
                "Marybeth";
        String[] sentToMethod = names.split("\n");

        String orderedNames = "Bo\n" +
                "Jean\n" +
                "Claude\n" +
                "Marybeth\n" +
                "William\n" +
                "Kevin\n" +
                "Pat";

        String[] processedBy = orderedNames.split("\n");

        assertEquals(Arrays.asList(processedBy), Arrays.asList(Main.addingNames(sentToMethod, n)));
    }

    @Test
    public void testRightOrderListTwo() {
        int n = 6;
        String names = "Jim\n" +
                "Ben\n" +
                "Zoe\n" +
                "Joey\n" +
                "Frederick\n" +
                "Annabelle";
        String[] sentToMethod = names.split("\n");

        String orderedNames = "Jim\n" +
                "Zoe\n" +
                "Frederick\n" +
                "Annabelle\n" +
                "Joey\n" +
                "Ben";

        String[] processedBy = orderedNames.split("\n");

        assertEquals(Arrays.asList(processedBy), Arrays.asList(Main.addingNames(sentToMethod, n)));
    }

    @Test
    public void testRightOrderListALL() {
        int n = 6;
        String names = "7\n" +
                "Bo\n" +
                "Pat\n" +
                "Jean\n" +
                "Kevin\n" +
                "Claude\n" +
                "William\n" +
                "Marybeth\n" +
                "6\n" +
                "Jim\n" +
                "Ben\n" +
                "Zoe\n" +
                "Joey\n" +
                "Frederick\n" +
                "Annabelle\n" +
                "5\n" +
                "John\n" +
                "Bill\n" +
                "Fran\n" +
                "Stan\n" +
                "Cece\n" +
                "0";
        String[] sentToMethod = names.split("\n");

        String orderedNames = "SET 1\n" +
                "Bo\n" +
                "Jean\n" +
                "Claude\n" +
                "Marybeth\n" +
                "William\n" +
                "Kevin\n" +
                "Pat\n" +
                "SET 2\n" +
                "Jim\n" +
                "Zoe\n" +
                "Frederick\n" +
                "Annabelle\n" +
                "Joey\n" +
                "Ben\n" +
                "SET 3\n" +
                "John\n" +
                "Fran\n" +
                "Cece\n" +
                "Stan\n" +
                "Bill\n";

        String[] processedBy = orderedNames.split("\n");

        Arrays.equals(processedBy, Main.addingNames(sentToMethod, n));
    }
}