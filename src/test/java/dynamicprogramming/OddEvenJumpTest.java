package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenJumpTest {

    @Test
    public void testCase1() {
        assertEquals(2, new OddEvenJump().oddEvenJumps(new int[]{10, 13, 12, 14, 15}));
    }

    @Test
    public void testCase2() {
        assertEquals(3, new OddEvenJump().oddEvenJumps(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void testCase3() {
        assertEquals(3, new OddEvenJump().oddEvenJumps(new int[]{5, 1, 3, 4, 2}));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new OddEvenJump().oddEvenJumps(new int[]{1}));
    }

}
