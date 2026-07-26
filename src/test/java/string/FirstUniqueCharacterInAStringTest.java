package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterInAStringTest {

    @Test
    void shouldReturnFirstIndexWhenFirstCharacterIsUnique() {
        var s = "leetcode";
        assertThat(new FirstUniqueCharacterInAString().firstUniqChar(s)).isEqualTo(0);
    }

    @Test
    void shouldFindUniqueCharacterInMiddleOfString() {
        var s = "loveleetcode";
        assertThat(new FirstUniqueCharacterInAString().firstUniqChar(s)).isEqualTo(2);
    }

    @Test
    void shouldReturnMinusOneWhenNoUniqueCharacterExists() {
        var s = "aabb";
        assertThat(new FirstUniqueCharacterInAString().firstUniqChar(s)).isEqualTo(-1);
    }
}
