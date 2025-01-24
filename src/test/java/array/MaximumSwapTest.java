package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSwapTest {

    @Test
    public void testCase1() {
        assertEquals(7236, new MaximumSwap().maximumSwap(2736));
    }

    @Test
    public void testCase2() {
        assertEquals(9973, new MaximumSwap().maximumSwap(9973));
    }
}
