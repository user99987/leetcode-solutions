package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {

    @Test
    public void testCase1() {
        assertTrue(new HappyNumber().isHappy(19));
    }

    @Test
    public void testCase2() {
        assertFalse(new HappyNumber().isHappy(2));
    }
}
