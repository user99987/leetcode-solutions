package array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTimeDifferenceTest {

    @Test
    public void testCase1() {
        assertEquals(1, new MinimumTimeDifference().findMinDifference(List.of("23:59", "00:00")));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new MinimumTimeDifference().findMinDifference(List.of("00:00", "23:59", "00:00")));
    }
}
