package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    @Test
    void testCase1() {
        assertThat(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1})).isTrue();
    }

    @Test
    void testCase2() {
        assertThat(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4})).isFalse();
    }

    @Test
    void testCase3() {
        assertThat(new ContainsDuplicate().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isTrue();
    }
}
