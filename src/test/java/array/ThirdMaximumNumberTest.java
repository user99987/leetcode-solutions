package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaximumNumberTest {

    @Test
    public void testCase1() {
        assertEquals(1, new ThirdMaximumNumber().thirdMax(new int[]{3, 2, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new ThirdMaximumNumber().thirdMax(new int[]{1, 2}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new ThirdMaximumNumber().thirdMax(new int[]{2, 2, 3, 1}));
    }
}
