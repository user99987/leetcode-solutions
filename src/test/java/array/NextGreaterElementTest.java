package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElementTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{-1, 3, -1}, new NextGreaterElement().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{3, -1}, new NextGreaterElement().nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }
}
