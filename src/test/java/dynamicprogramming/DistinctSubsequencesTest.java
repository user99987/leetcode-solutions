package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctSubsequencesTest {

    @Test
    public void testCase1() {
        assertEquals(3, new DistinctSubsequences().numDistinct("rabbbit", "rabbit"));
    }

    @Test
    public void testCase2() {
        assertEquals(5, new DistinctSubsequences().numDistinct("babgbag", "bag"));
    }
}

