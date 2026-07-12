package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class KokoEatingBananasTest {

    @Test
    public void testCase1() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{3, 6, 7, 11}, 8)).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5)).isEqualTo(30);
    }

    @Test
    public void testCase3() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6)).isEqualTo(23);
    }
}
