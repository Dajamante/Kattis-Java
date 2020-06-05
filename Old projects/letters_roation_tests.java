import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {


    @Test
    void testRotate1() {
        char[] resultExpected = "ZRKB".toCharArray();
        char[] arraySentToSlackteriet = "EWPG".toCharArray();

        assertArrayEquals(resultExpected, Main.rotate(arraySentToSlackteriet, 47));
    }

    @Test
    void testRotate2() {
        char[] resultExpected = "BKSC".toCharArray();
        char[] arraySentToSlackteriet = "AJRB".toCharArray();

        assertArrayEquals(resultExpected, Main.rotate(arraySentToSlackteriet, 27));
    }

    @Test
    void rotateOneByTheOther() {
        char[] resultExpected = "ABCD".toCharArray();
        char[] arrayA = "ZRKB".toCharArray();
        char[] arrayB = "BKSC".toCharArray();
        assertArrayEquals(resultExpected, Main.rotateOneByTheOther(arrayA, arrayB));

    }
}