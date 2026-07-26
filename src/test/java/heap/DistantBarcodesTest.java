package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistantBarcodesTest {

    @Test
    public void shouldRearrangeEqualGroupsWithNoAdjacentDuplicates() {
        var result = new DistantBarcodes().rearrangeBarcodes(new int[]{1, 1, 1, 2, 2, 2});
        assertNoAdjacentDuplicates(result);
        assertThat(result).containsExactlyInAnyOrder(1, 1, 1, 2, 2, 2);
    }

    @Test
    public void shouldRearrangeUnequalGroupsWithNoAdjacentDuplicates() {
        var result = new DistantBarcodes().rearrangeBarcodes(new int[]{1, 1, 1, 1, 2, 2, 3, 3});
        assertNoAdjacentDuplicates(result);
        assertThat(result).containsExactlyInAnyOrder(1, 1, 1, 1, 2, 2, 3, 3);
    }

    @Test
    public void shouldReturnSameBarcodeForSingleElement() {
        assertThat(new DistantBarcodes().rearrangeBarcodes(new int[]{5})).containsExactly(5);
    }

    @Test
    public void shouldReturnAnyOrderWhenAllBarcodesAreDistinct() {
        var result = new DistantBarcodes().rearrangeBarcodes(new int[]{1, 2, 3});
        assertNoAdjacentDuplicates(result);
        assertThat(result).containsExactlyInAnyOrder(1, 2, 3);
    }

    @Test
    public void shouldAvoidAdjacentDuplicatesForTwoAlternatingBarcodes() {
        var result = new DistantBarcodes().rearrangeBarcodes(new int[]{1, 1, 2, 2});
        assertNoAdjacentDuplicates(result);
    }

    private void assertNoAdjacentDuplicates(int[] result) {
        for (int i = 1; i < result.length; i++) {
            assertThat(result[i]).isNotEqualTo(result[i - 1]);
        }
    }
}
