package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{1, 2, 4}, new PlusOne().plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, new PlusOne().plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new int[]{1}, new PlusOne().plusOne(new int[]{0}));
    }

    @Test
    public void testCase4() {
        assertArrayEquals(new int[]{1, 0}, new PlusOne().plusOne(new int[]{9}));
    }
}
