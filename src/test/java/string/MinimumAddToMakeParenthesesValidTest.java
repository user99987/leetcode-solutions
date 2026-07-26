package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumAddToMakeParenthesesValidTest {

    @Test
    void shouldNeedOneInsertionForUnmatchedClosingParenthesis() {
        assertThat(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())")).isEqualTo(1);
    }

    @Test
    void shouldNeedInsertionForEachUnmatchedOpeningParenthesis() {
        assertThat(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("(((")).isEqualTo(3);
    }
}
