package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterInAStringTest {

    @Test
    void testCase1() {
        var s = "leetcode";
        assertThat(new FirstUniqueCharacterInAString().firstUniqChar(s)).isEqualTo(0);
    }

    @Test
    void testCase2() {
        var s = "loveleetcode";
        assertThat(new FirstUniqueCharacterInAString().firstUniqChar(s)).isEqualTo(2);
    }

    @Test
    void testCase3() {
        var s = "aabb";
        assertThat(new FirstUniqueCharacterInAString().firstUniqChar(s)).isEqualTo(-1);
    }
}
