package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    @Test
    public void testCase1() {
        assertEquals("210", new LargestNumber().largestNumber(new int[]{10, 2}));
    }

    @Test
    public void testCase2() {
        assertEquals("9534330", new LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    public void testCase3() {
        assertEquals("1", new LargestNumber().largestNumber(new int[]{1}));
    }

    @Test
    public void testCase4() {
        assertEquals("10", new LargestNumber().largestNumber(new int[]{10}));
    }
}
