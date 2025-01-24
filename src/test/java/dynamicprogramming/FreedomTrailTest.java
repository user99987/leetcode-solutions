package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreedomTrailTest {

    @Test
    public void testCase1() {
        assertEquals(4, new FreedomTrail().findRotateSteps("godding", "gd"));
    }

    @Test
    public void testCase2() {
        assertEquals(13, new FreedomTrail().findRotateSteps("godding", "godding"));
    }
}
