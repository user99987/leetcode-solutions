package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsomorphicStringsTest {

    @Test
    public void shouldReturnTrueForIsomorphicStrings() {
        assertThat(new IsomorphicStrings().isIsomorphic("egg", "add")).isTrue();
    }

    @Test
    public void shouldReturnFalseForNonIsomorphicStrings() {
        assertThat(new IsomorphicStrings().isIsomorphic("foo", "bar")).isFalse();
    }

    @Test
    public void shouldReturnTrueForLongerIsomorphicStrings() {
        assertThat(new IsomorphicStrings().isIsomorphic("paper", "title")).isTrue();
    }
}
