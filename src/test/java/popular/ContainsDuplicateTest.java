package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    @Test
    void shouldReturnTrueWhenArrayHasDuplicate() {
        assertThat(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1})).isTrue();
    }

    @Test
    void shouldReturnFalseWhenAllElementsAreUnique() {
        assertThat(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4})).isFalse();
    }

    @Test
    void shouldReturnTrueForMultipleDuplicatesInArray() {
        assertThat(new ContainsDuplicate().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isTrue();
    }
}
