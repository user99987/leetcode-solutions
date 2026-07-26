package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateStringTest {

    @Test
    void shouldReturnTrueWhenGoalIsAValidRotation() {
        assertThat(new RotateString().rotateString("abcde", "cdeab")).isTrue();
    }

    @Test
    void shouldReturnFalseWhenGoalIsNotARotation() {
        assertThat(new RotateString().rotateString("abcde", "abced")).isFalse();
    }

    @Test
    void shouldReturnTrueForIdenticalSingleCharacterStrings() {
        assertThat(new RotateString().rotateString("a", "a")).isTrue();
    }

    @Test
    void shouldReturnFalseWhenLengthsDiffer() {
        assertThat(new RotateString().rotateString("abc", "abcd")).isFalse();
    }
}
