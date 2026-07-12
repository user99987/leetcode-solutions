package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class TextJustificationTest {

    @Test
    public void testCase1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        var maxWidth = 16;
        List<String> expected = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        assertThat(new TextJustification().fullJustify(words, maxWidth)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        var maxWidth = 16;
        List<String> expected = Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );
        assertThat(new TextJustification().fullJustify(words, maxWidth)).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to",
                "explain", "to", "a", "computer.", "Art", "is", "everything", "else",
                "we", "do"};
        var maxWidth = 20;
        List<String> expected = Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        );
        assertThat(new TextJustification().fullJustify(words, maxWidth)).isEqualTo(expected);
    }
}
