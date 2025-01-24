package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringsTest {

    @Test
    public void testCase1() {
        assertTrue(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    @Test
    public void testCase2() {
        assertFalse(new IsomorphicStrings().isIsomorphic("foo", "bar"));
    }

    @Test
    public void testCase3() {
        assertTrue(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }
}
