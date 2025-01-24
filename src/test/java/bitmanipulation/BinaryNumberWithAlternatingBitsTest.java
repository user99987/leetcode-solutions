package bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void testCase1() {
        assertTrue(new BinaryNumberWithAlternatingBits().hasAlternatingBits(5));
    }

    @Test
    public void testCase2() {
        assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(7));
    }

    @Test
    public void testCase3() {
        assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(11));
    }
}
