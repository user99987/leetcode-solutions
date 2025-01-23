package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    @Test
    public void testCase1() {
        assertEquals(6, new TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(9, new TrappingRainWater().trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
