package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationInStringTest {

    @Test
    void testCase1() {
        var s1 = "ab";
        var s2 = "eidbaooo";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isTrue();
    }

    @Test
    void testCase2() {
        var s1 = "ab";
        var s2 = "eidboaoo";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isFalse();
    }

    @Test
    void testCase3() {
        var s1 = "abc";
        var s2 = "ccccbabaaaa";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isTrue();
    }

    @Test
    void testCase4() {
        var s1 = "abcd";
        var s2 = "efgh";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isFalse();
    }

    @Test
    void testCase5() {
        var s1 = "a";
        var s2 = "a";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isTrue();
    }
}
