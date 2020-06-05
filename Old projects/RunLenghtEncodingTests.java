
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    void processCodingLongHello() {
        char[] sentToMethod = "Heellooo!!!".toCharArray();
        String processedBy = "H1e2l2o3!3";
        assertEquals(processedBy, Main.encoding(sentToMethod));
    }
    @Test
    void processCodingShortHello() {
        char[] sentToMethod = "Hello!!!".toCharArray();
        String processedBy = "H1e1l2o1!3";
        assertEquals(processedBy, Main.encoding(sentToMethod));
    }


    @Test
    void decoding() {
        char[] sentToMethod = "H3e2l3o1W1o3r4l2d1!2".toCharArray();
        String processedBy = "HHHeellloWooorrrrlld!!";
        assertEquals(processedBy, Main.decoding(sentToMethod));
    }
}


