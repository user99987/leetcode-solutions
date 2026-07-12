package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsomorphicStringsTest {

    @Test
    public void testCase1() {
        assertThat(new IsomorphicStrings().isIsomorphic("egg", "add")).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new IsomorphicStrings().isIsomorphic("foo", "bar")).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new IsomorphicStrings().isIsomorphic("paper", "title")).isTrue();
    }
}
