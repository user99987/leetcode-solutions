package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueReconstructionByHeightTest {

    @Test
    public void shouldReconstructQueueForMixedHeightsExample() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] expected = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertThat(new QueueReconstructionByHeight().reconstructQueue(people)).isEqualTo(expected);
    }

    @Test
    public void shouldReconstructQueueForDescendingHeights() {
        int[][] people = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};
        int[][] expected = {{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6, 0}};
        assertThat(new QueueReconstructionByHeight().reconstructQueue(people)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameArrayForSinglePerson() {
        int[][] people = {{5, 0}};
        int[][] expected = {{5, 0}};
        assertThat(new QueueReconstructionByHeight().reconstructQueue(people)).isEqualTo(expected);
    }

    @Test
    public void shouldOrderBySecondValueWhenAllHeightsAreEqual() {
        int[][] people = {{5, 2}, {5, 0}, {5, 1}};
        int[][] expected = {{5, 0}, {5, 1}, {5, 2}};
        assertThat(new QueueReconstructionByHeight().reconstructQueue(people)).isEqualTo(expected);
    }
}
