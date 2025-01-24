package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RussianDollEnvelopesTest {

    @Test
    public void testCase1() {
        assertEquals(3, new RussianDollEnvelopes().maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new RussianDollEnvelopes().maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}}));
    }

}
