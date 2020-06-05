
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testProcessLocationsWhen123() {
        int places = 7;
        int witnesses = 3;

        int[] locations = {1,2,3};
        assertEquals( "1 3 4 5 6 7", Main.processLocations(locations, places, witnesses));
    }

    @Test
    public void testProcessLocationsWhen357() {
        int places = 7;
        int witnesses = 3;

        int[] locations = {3, 5, 7};
        assertEquals( "1 2 3 7", Main.processLocations(locations, places, witnesses));
    }

    @Test
    public void testProcessLocationsWhen3_5() {
        int places = 7;
        int witnesses = 2;

        int[] locations = {3, 5};
        assertEquals( "1 2 3 5 6 7", Main.processLocations(locations, places, witnesses));
    }
    @Test
    public void testProcessLocationsWhen1_2() {
        int places = 7;
        int witnesses = 2;

        int[] locations = {1, 2};
        assertEquals( "1 2 3 4 5 6 7", Main.processLocations(locations, places, witnesses));
    }
    @Test
    public void testProcessLocationsWhen1() {
        int places = 7;
        int witnesses = 1;

        int[] locations = {1};
        assertEquals( "1 2 3 4 5 6 7", Main.processOneLocation(places));
    }
    @Test
    public void testProcessLocationsWhen3() {
        int places = 7;
        int witnesses = 1;

        int[] locations = {3};
        assertEquals( "1 2 3 4 5 6 7", Main.processOneLocation(places));
    }
}