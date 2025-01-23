package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {

    @Test
    public void testCase1() {
        assertEquals(3, new NumberOf1Bits().hammingWeight(0b00000000000000000000000000001011));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new NumberOf1Bits().hammingWeight(0b00000000000000000000000010000000));
    }

    @Test
    public void testCase3() {
        assertEquals(31, new NumberOf1Bits().hammingWeight(0b11111111111111111111111111111101));
    }
}
