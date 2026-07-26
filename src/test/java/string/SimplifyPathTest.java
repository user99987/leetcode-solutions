package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimplifyPathTest {

    @Test
    public void shouldRemoveTrailingSlash() {
        var path = "/home/";
        var expected = "/home";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }

    @Test
    public void shouldTreatParentOfRootAsRoot() {
        var path = "/../";
        var expected = "/";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }

    @Test
    public void shouldCollapseMultipleConsecutiveSlashes() {
        var path = "/home//foo/";
        var expected = "/home/foo";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }

    @Test
    public void shouldResolveCurrentAndParentDirectoryReferences() {
        var path = "/a/./b/../../c/";
        var expected = "/c";
        assertThat(new SimplifyPath().simplifyPath(path)).isEqualTo(expected);
    }
}
