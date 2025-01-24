package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleElementInASortedArrayTest {

    @Test
    public void testCase1() {
        assertEquals(2, new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
    }

    @Test
    public void testCase2() {
        assertEquals(10, new SingleElementInASortedArray().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
    }
}
