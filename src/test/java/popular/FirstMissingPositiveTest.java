package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstMissingPositiveTest {

    @Test
    public void testCase1() {
        assertEquals(3, new FirstMissingPositive().firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}

