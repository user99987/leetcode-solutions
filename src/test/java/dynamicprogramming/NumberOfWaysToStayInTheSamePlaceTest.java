package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfWaysToStayInTheSamePlaceTest {

    @Test
    public void testCase1() {
        assertEquals(4, new NumberOfWaysToStayInTheSamePlace().numWays(3, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new NumberOfWaysToStayInTheSamePlace().numWays(2, 4));
    }

    @Test
    public void testCase3() {
        assertEquals(8, new NumberOfWaysToStayInTheSamePlace().numWays(4, 2));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new NumberOfWaysToStayInTheSamePlace().numWays(1, 1));
    }

    @Test
    public void testCase5() {
        assertEquals(1, new NumberOfWaysToStayInTheSamePlace().numWays(500, 1));
    }

}
