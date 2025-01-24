package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RelativeRanksTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
                new RelativeRanks().findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"},
                new RelativeRanks().findRelativeRanks(new int[]{10, 3, 8, 9, 4}));
    }
}
