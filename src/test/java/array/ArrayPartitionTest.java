package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayPartitionTest {

    @Test
    public void testCase1() {
        assertEquals(4, new ArrayPartition().arrayPairSum(new int[]{1, 4, 3, 2}));
    }

    @Test
    public void testCase2() {
        assertEquals(9, new ArrayPartition().arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }
}
