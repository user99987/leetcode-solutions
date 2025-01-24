package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringTest {

    @Test
    void testCase1() {
        String s = "leetcode";
        assertEquals(0, new FirstUniqueCharacterInAString().firstUniqChar(s));
    }

    @Test
    void testCase2() {
        String s = "loveleetcode";
        assertEquals(2, new FirstUniqueCharacterInAString().firstUniqChar(s));
    }

    @Test
    void testCase3() {
        String s = "aabb";
        assertEquals(-1, new FirstUniqueCharacterInAString().firstUniqChar(s));
    }
}
