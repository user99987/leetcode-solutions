package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumMovesToEqualArrayTest {

    @Test
    public void testCase1() {
        assertEquals(3, new MinimumMovesToEqualArray().minMoves(new int[]{1, 2, 3}));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new MinimumMovesToEqualArray().minMoves(new int[]{1, 1, 1}));
    }
}
