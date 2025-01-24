package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringTest {

    @Test
    void testCase1() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }

    @Test
    void testCase2() {
        String input = " hello world ";
        String expected = "world hello";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }

    @Test
    void testCase3() {
        String input = "a good example";
        String expected = "example good a";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }

    @Test
    void testCase4() {
        String input = " Bob Loves Alice ";
        String expected = "Alice Loves Bob";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }

    @Test
    void testCase5() {
        String input = "Alice does not even like bob";
        String expected = "bob like even not does Alice";
        assertEquals(expected, new ReverseWordsInAString().reverseWords(input));
    }
}
