package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class PartitionLabelsTest {

    @Test
    public void testCase1() {
        assertThat(new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij")).isEqualTo(List.of(9, 7, 8));
    }

    @Test
    public void testCase2() {
        assertThat(new PartitionLabels().partitionLabels("eccbbbbdec")).isEqualTo(List.of(10));
    }
}
