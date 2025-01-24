package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LetterCasePermutationTest {

    @Test
    public void testCase1() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("a1b2");
        List<String> expected = List.of("a1b2", "a1B2", "A1b2", "A1B2");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testCase2() {
        List<String> result = new LetterCasePermutation().letterCasePermutation("3z4");
        List<String> expected = List.of("3z4", "3Z4");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }
}
