package popular;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {

    @Test
    public void testCase1() {
        assertTrue(new WordBreak().wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    public void testCase2() {
        assertTrue(new WordBreak().wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    public void testCase3() {
        assertFalse(new WordBreak().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }
}
