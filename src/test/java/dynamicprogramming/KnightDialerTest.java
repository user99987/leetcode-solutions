package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightDialerTest {

    @Test
    public void testCase1() {
        assertEquals(10, new KnightDialer().knightDialer(1));
    }

    @Test
    public void testCase2() {
        assertEquals(20, new KnightDialer().knightDialer(2));
    }

    @Test
    public void testCase3() {
        assertEquals(136006598, new KnightDialer().knightDialer(3131));
    }
}
