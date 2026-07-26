package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateIITest {

    @Test
    void shouldFindNearbyDuplicateWithinDistance() {
        assertThat(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
    }

    @Test
    void shouldFindAdjacentDuplicateWithinDistanceOne() {
        assertThat(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 0, 0, 1}, 1)).isTrue();
    }

    @Test
    void shouldReturnFalseWhenDuplicateExceedsDistance() {
        assertThat(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
    }
}
