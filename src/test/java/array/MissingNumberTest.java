package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    public void testCase1() {
        assertEquals(2, new MissingNumber().missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(8, new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new MissingNumber().missingNumber(new int[]{0}));
    }
}
