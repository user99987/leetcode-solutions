package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAddToMakeParenthesesValidTest {

    @Test
    void testCase1() {
        assertEquals(1, new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())"));
    }

    @Test
    void testCase2() {
        assertEquals(3, new MinimumAddToMakeParenthesesValid().minAddToMakeValid("((("));
    }
}
