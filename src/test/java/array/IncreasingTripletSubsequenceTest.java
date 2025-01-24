package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void testCase1() {
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testCase2() {
        assertFalse(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testCase3() {
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}
