package greedy;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionLabelsTest {

    @Test
    public void testCase1() {
        assertEquals(List.of(9, 7, 8), new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void testCase2() {
        assertEquals(List.of(10), new PartitionLabels().partitionLabels("eccbbbbdec"));
    }
}
