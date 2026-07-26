package backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class LetterCasePermutationTest {

    @Test
    public void shouldGenerateAllCasePermutationsForMixedString() {
        var result = new LetterCasePermutation().letterCasePermutation("a1b2");
        List<String> expected = List.of("a1b2", "a1B2", "A1b2", "A1B2");
        assertThat(result.containsAll(expected) && expected.containsAll(result)).isTrue();
    }

    @Test
    public void shouldGenerateAllCasePermutationsForSingleLetter() {
        var result = new LetterCasePermutation().letterCasePermutation("3z4");
        List<String> expected = List.of("3z4", "3Z4");
        assertThat(result.containsAll(expected) && expected.containsAll(result)).isTrue();
    }

    @Test
    public void shouldReturnOnlyItselfWhenStringHasNoLetters() {
        assertThat(new LetterCasePermutation().letterCasePermutation("129")).containsExactly("129");
    }
}
