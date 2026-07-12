package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromicSubstringsTest {

    @Test
    public void testCase1() {
        assertThat(new PalindromicSubstrings().countSubstrings("abc")).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new PalindromicSubstrings().countSubstrings("aaa")).isEqualTo(6);
    }

    @Test
    public void testCase3() {
        assertThat(new PalindromicSubstrings().countSubstrings("a")).isEqualTo(1);
    }

    @Test
    public void testCase4() {
        assertThat(new PalindromicSubstrings().countSubstrings("")).isEqualTo(0);
    }

}
