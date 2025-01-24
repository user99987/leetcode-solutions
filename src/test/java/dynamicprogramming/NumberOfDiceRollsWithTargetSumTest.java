package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDiceRollsWithTargetSumTest {

    @Test
    public void testCase1() {
        assertEquals(1, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(1, 6, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(6, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 7));
    }

    @Test
    public void testCase3() {
        assertEquals(222616187, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(30, 30, 500));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new NumberOfDiceRollsWithTargetSum().numRollsToTarget(2, 6, 15));
    }
}
