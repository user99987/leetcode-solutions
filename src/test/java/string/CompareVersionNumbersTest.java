package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionNumbersTest {

    @Test
    public void testCase1() {
        assertEquals(0, new CompareVersionNumbers().compareVersion("1.01", "1.001"));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new CompareVersionNumbers().compareVersion("1.0", "1.0.0"));
    }

    @Test
    public void testCase3() {
        assertEquals(-1, new CompareVersionNumbers().compareVersion("0.1", "1.1"));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new CompareVersionNumbers().compareVersion("1.2", "1.1"));
    }

}
