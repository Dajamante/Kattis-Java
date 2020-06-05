import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {
    Main.BishopPosition attackerA1;
    Main.BishopPosition attackerB2;
    Main.BishopPosition targetA2;
    Main.BishopPosition targetE5;
    Main.BishopPosition targetA1Copy;
    Main.BishopPosition targetAndAttackerA3;
    Main.BishopPosition attackerF1;
    Main.BishopPosition targetE8;
    Main.BishopPosition posB5;
    Main.BishopPosition posB2;
    Main.BishopPosition outOfRange;

    @Before
    public void setData() {
        attackerA1 = new Main.BishopPosition(1, 1); //A1
        attackerB2 = new Main.BishopPosition(2, 2); //B2
        attackerF1 = new Main.BishopPosition(6,1);

        targetA2 = new Main.BishopPosition(1, 2);
        targetE5 = new Main.BishopPosition(5,5);
        targetA1Copy = attackerA1;
        targetE8 = new Main.BishopPosition(5, 8); //E8
        targetAndAttackerA3 = new Main.BishopPosition(1,3); //A 3 A 3

        posB5 = new Main.BishopPosition(2,5); //B5
        posB2 = new Main.BishopPosition(2,2);
        outOfRange = new Main.BishopPosition(-1,-1);
    }

    @Test
    public void isSame() {
        assertTrue(Main.isSame(attackerA1, targetA1Copy));
        assertFalse(Main.isSame(attackerB2, targetA2));
        assertTrue(Main.isSame(targetAndAttackerA3, targetAndAttackerA3));

    }

    @Test
    public void isSameDiagonal() {
        assertTrue(Main.isSameDiagonal(attackerA1, attackerB2));
    }

    @Test
    public void standOnDifferentColors() {
        assertTrue(Main.isSameDiagonal(attackerA1, targetAndAttackerA3));
        assertFalse(Main.isSameDiagonal(attackerA1, targetA2));

    }

    @Test
    public void attackWithNegativeSlope() {
        Main.BishopPosition returnValue = Main.attackWithNegativeSlope(attackerF1, targetE8);
        assertEquals(returnValue.x, posB5.x);
        assertEquals(returnValue.y, posB5.y);

        returnValue = Main.attackWithNegativeSlope(attackerA1, targetAndAttackerA3);
        assertEquals(returnValue.x, outOfRange.x);
        assertEquals(returnValue.y, outOfRange.y);
    }

    @Test
    public void attackWithPositiveSlope() {
        Main.BishopPosition returnValue = Main.attackWithPositiveSlope(attackerA1, targetAndAttackerA3);
        assertEquals(returnValue.x, posB2.x);
        assertEquals(returnValue.y, posB2.y);
    }

    @Test
    public void main() {
    }
}