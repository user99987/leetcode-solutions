package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void testCase1() {
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
                new LetterCombinationsOfPhoneNumber().letterCombinations("23"));
    }

    @Test
    public void testCase2() {
        assertEquals(List.of(), new LetterCombinationsOfPhoneNumber().letterCombinations(""));
    }

    @Test
    public void testCase3() {
        assertEquals(Arrays.asList("a", "b", "c"),
                new LetterCombinationsOfPhoneNumber().letterCombinations("2"));
    }
}
