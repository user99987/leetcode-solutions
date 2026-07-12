package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateStringTest {

    @Test
    void testCase1() {
        assertThat(new RotateString().rotateString("abcde", "cdeab")).isTrue();
    }

    @Test
    void testCase2() {
        assertThat(new RotateString().rotateString("abcde", "abced")).isFalse();
    }

    @Test
    void testCase3() {
        assertThat(new RotateString().rotateString("a", "a")).isTrue();
    }

    @Test
    void testCase4() {
        assertThat(new RotateString().rotateString("abc", "abcd")).isFalse();
    }
}
