import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void basic() {
        assertEquals("", Main.sortBusses());
        assertEquals("1", Main.sortBusses(1));
        assertEquals("1 2", Main.sortBusses(1, 2));
        assertEquals("1-3", Main.sortBusses(1, 2, 3));
        assertEquals("1 3", Main.sortBusses(1, 3));
        assertEquals("1 3", Main.sortBusses(3, 1));
        assertEquals("2 3", Main.sortBusses(3, 2));
        assertEquals("1 7 8", Main.sortBusses(1, 7, 8));
        assertEquals("1 7-9", Main.sortBusses(1, 7, 8, 9));
        assertEquals("1-3 9", Main.sortBusses(1, 3, 9));

    }

    @Test
    public void consecutivePar() {
        assertEquals("1-5", Main.sortBusses(1, 2, 3, 4, 5));
    }

    @Test
    public void kattisTest() {
        assertEquals("141-143 174 175 180", Main.sortBusses(180, 141, 174, 143, 142, 175));
    }

    @Test
    public void kattisTest2() {
        assertEquals("141 180", Main.sortBusses(180, 141));
    }

    @Test
    public void kattisTest3() {
        assertEquals("141-143 174 175 180 185 210", Main.sortBusses(180, 141, 185, 174, 210, 143, 142, 175));
    }
}

