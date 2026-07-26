package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IPOTest {

    @Test
    public void shouldMaximizeCapitalWithTwoProjects() {
        assertThat(new IPO().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1})).isEqualTo(4);
    }

    @Test
    public void shouldMaximizeCapitalWithThreeProjects() {
        assertThat(new IPO().findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2})).isEqualTo(6);
    }

    @Test
    public void shouldReturnInitialCapitalWhenNoProjectsAreAffordable() {
        assertThat(new IPO().findMaximizedCapital(2, 0, new int[]{5}, new int[]{10})).isEqualTo(0);
    }

    @Test
    public void shouldReturnInitialCapitalWhenKIsZero() {
        assertThat(new IPO().findMaximizedCapital(0, 5, new int[]{10}, new int[]{0})).isEqualTo(5);
    }

    @Test
    public void shouldCompleteSingleAffordableProject() {
        assertThat(new IPO().findMaximizedCapital(1, 0, new int[]{5}, new int[]{0})).isEqualTo(5);
    }

    @Test
    public void shouldUseAllAffordableProjectsWhenKExceedsCount() {
        assertThat(new IPO().findMaximizedCapital(10, 0, new int[]{1, 2, 3}, new int[]{0, 0, 0})).isEqualTo(6);
    }
}
