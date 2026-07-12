package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimplifyPathTest {

    @Test
    public void testCase1() {
        var path = "/home/";
        var expected = "/home";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var path = "/../";
        var expected = "/";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        var path = "/home//foo/";
        var expected = "/home/foo";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }

    @Test
    public void testCase4() {
        var path = "/a/./b/../../c/";
        var expected = "/c";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }
}
