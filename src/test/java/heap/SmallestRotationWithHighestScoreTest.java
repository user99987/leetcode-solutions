package heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallestRotationWithHighestScoreTest {

    @Test
    public void testCase1() {
        assertEquals(3, new SmallestRotationWithHighestScore().bestRotation(new int[]{2, 3, 1, 4, 0}));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new SmallestRotationWithHighestScore().bestRotation(new int[]{1, 3, 0, 2, 4}));
    }
}
