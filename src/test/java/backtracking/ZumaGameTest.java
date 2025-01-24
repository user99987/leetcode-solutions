package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZumaGameTest {

    @Test
    public void testCase1() {
        assertEquals(-1, new ZumaGame().findMinStep("WRRBBW", "RB"));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new ZumaGame().findMinStep("WWRRBBWW", "WRBRW"));
    }

    @Test
    public void testCase3() {
        assertEquals(2, new ZumaGame().findMinStep("G", "GGGGG"));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new ZumaGame().findMinStep("BBWWRRYYRRWWBB", "Y"));
    }
}
