package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;


public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void testCase1() {
        assertThat(new LetterCombinationsOfPhoneNumber().letterCombinations("23")).isEqualTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }

    @Test
    public void testCase2() {
        assertThat(new LetterCombinationsOfPhoneNumber().letterCombinations("")).isEqualTo(List.of());
    }

    @Test
    public void testCase3() {
        assertThat(new LetterCombinationsOfPhoneNumber().letterCombinations("2")).isEqualTo(Arrays.asList("a", "b", "c"));
    }
}
