package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {

    @Test
    public void testCase1() {
        String path = "/home/";
        String expected = "/home";
        assertEquals(expected, new SimplifyPath().simplifyPath(path));
    }

    @Test
    public void testCase2() {
        String path = "/../";
        String expected = "/";
        assertEquals(expected, new SimplifyPath().simplifyPath(path));
    }

    @Test
    public void testCase3() {
        String path = "/home//foo/";
        String expected = "/home/foo";
        assertEquals(expected, new SimplifyPath().simplifyPath(path));
    }

    @Test
    public void testCase4() {
        String path = "/a/./b/../../c/";
        String expected = "/c";
        assertEquals(expected, new SimplifyPath().simplifyPath(path));
    }
}
