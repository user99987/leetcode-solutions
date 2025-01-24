package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDistanceToTypeAWordUsingTwoFingersTest {

    @Test
    public void testCase1() {
        assertEquals(3, new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("CAKE"));
    }

    @Test
    public void testCase2() {
        assertEquals(6, new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("HAPPY"));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("AA"));
    }

}
