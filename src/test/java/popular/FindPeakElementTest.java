package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindPeakElementTest {

    @Test
    public void testCase1() {
        var peakIndex = new FindPeakElement().findPeakElement(new int[]{1, 2, 3, 1});
        assertThat(peakIndex).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        var peakIndex = new FindPeakElement().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        assertThat(peakIndex).isIn(1, 5);
    }
}
