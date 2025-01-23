package popular;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JumpGameTest {

    @Test
    public void testCase1() {
        assertTrue(new JumpGame().canJump(new int[] {2, 3, 1, 1, 4}));
    }

    @Test
    public void testCase2() {
        assertFalse(new JumpGame().canJump(new   int[] {3, 2, 1, 0, 4}));
    }
}
