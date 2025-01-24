package binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KokoEatingBananasTest {

    @Test
    public void testCase1() {
        assertEquals(4, new KokoEatingBananas().minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    public void testCase2() {
        assertEquals(30, new KokoEatingBananas().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    public void testCase3() {
        assertEquals(23, new KokoEatingBananas().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }
}
