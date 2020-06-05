
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    void processStringHiIsCorrect() {
        String sentToMethod = "hi";
        String processedBy = "44 444";

        assertEquals(processedBy, Main.processWord(sentToMethod));
    }

    @Test
    void processStringYesIsCorrect() {
        String sentToMethod = "yes";
        String processedBy = "999337777";

        assertEquals(processedBy, Main.processWord(sentToMethod));
    }

    @Test
    void processStringFoo__BarIsCorrect() {
        String sentToMethod = "foo  bar";
        String processedBy = "333666 6660 022 2777";

        assertEquals(processedBy, Main.processWord(sentToMethod));
    }

    @Test
    void processStringHello_WorldIsCorrect() {
        String sentToMethod = "hello world";
        String processedBy = "4433555 555666096667775553";

        assertEquals(processedBy, Main.processWord(sentToMethod));
    }

    @Test
    void processStringWorld() {
        String sentToMethod = "world";
        String processedBy = "96667775553";

        assertEquals(processedBy, Main.processWord(sentToMethod));
    }
}


