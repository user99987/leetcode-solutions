package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideTwoIntegersTest {

    @Test
    public void testCase1() {
        assertEquals(3, new DivideTwoIntegers().divide(10, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(-2, new DivideTwoIntegers().divide(7, -3));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new DivideTwoIntegers().divide(0, 1));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new DivideTwoIntegers().divide(1, 1));
    }
}
