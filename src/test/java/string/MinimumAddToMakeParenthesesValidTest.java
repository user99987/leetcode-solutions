package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumAddToMakeParenthesesValidTest {

    @Test
    void testCase1() {
        assertThat(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())")).isEqualTo(1);
    }

    @Test
    void testCase2() {
        assertThat(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("(((")).isEqualTo(3);
    }
}
