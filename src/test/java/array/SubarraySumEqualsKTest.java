package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySumEqualsKTest {

    @Test
    public void testCase1() {
        assertEquals(2, new SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 3}, 3));
    }
}
