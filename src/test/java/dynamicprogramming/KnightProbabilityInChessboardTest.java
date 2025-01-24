package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightProbabilityInChessboardTest {

    @Test
    public void testCase1() {
        assertEquals(0.0625, new KnightProbabilityInChessboard().knightProbability(3, 2, 0, 0), 1e-5);
    }

    @Test
    public void testCase2() {
        assertEquals(1.0, new KnightProbabilityInChessboard().knightProbability(1, 0, 0, 0), 1e-5);
    }
}
