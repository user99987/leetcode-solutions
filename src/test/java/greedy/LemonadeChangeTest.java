package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LemonadeChangeTest {

    @Test
    public void testCase1() {
        assertTrue(new LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }

    @Test
    public void testCase2() {
        assertFalse(new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}
