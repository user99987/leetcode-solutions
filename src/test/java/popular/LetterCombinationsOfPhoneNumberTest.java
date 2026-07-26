package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;


public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void shouldGenerateCombinationsForTwoDigits() {
        assertThat(new LetterCombinationsOfPhoneNumber().letterCombinations("23")).isEqualTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }

    @Test
    public void shouldReturnEmptyListForEmptyInput() {
        assertThat(new LetterCombinationsOfPhoneNumber().letterCombinations("")).isEqualTo(List.of());
    }

    @Test
    public void shouldGenerateCombinationsForSingleDigit() {
        assertThat(new LetterCombinationsOfPhoneNumber().letterCombinations("2")).isEqualTo(Arrays.asList("a", "b", "c"));
    }
}
