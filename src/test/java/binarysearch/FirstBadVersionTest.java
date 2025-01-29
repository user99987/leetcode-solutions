package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersionTest {

    @Test
    public void testCase1() {
        assertEquals(4, new FirstBadVersion().firstBadVersion(5, 4));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new FirstBadVersion().firstBadVersion(1, 1));
    }
}

