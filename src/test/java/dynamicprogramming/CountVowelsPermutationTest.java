package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsPermutationTest {

    @Test
    public void testCase1() {
        assertEquals(5, new CountVowelsPermutation().countVowelPermutation(1));
    }

    @Test
    public void testCase2() {
        assertEquals(10, new CountVowelsPermutation().countVowelPermutation(2));
    }

    @Test
    public void testCase3() {
        assertEquals(68, new CountVowelsPermutation().countVowelPermutation(5));
    }
}
