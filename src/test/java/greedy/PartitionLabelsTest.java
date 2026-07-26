package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PartitionLabelsTest {

    @Test
    public void shouldPartitionStringIntoThreeParts() {
        assertThat(new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij")).containsExactly(9, 7, 8);
    }

    @Test
    public void shouldReturnSinglePartitionForOverlappingLetters() {
        assertThat(new PartitionLabels().partitionLabels("eccbbbbdec")).containsExactly(10);
    }

    @Test
    public void shouldReturnOnePartOfSizeOneForSingleCharacter() {
        assertThat(new PartitionLabels().partitionLabels("a")).containsExactly(1);
    }

    @Test
    public void shouldPartitionEachDistinctCharacterSeparately() {
        assertThat(new PartitionLabels().partitionLabels("abcde")).containsExactly(1, 1, 1, 1, 1);
    }

    @Test
    public void shouldReturnSinglePartitionWhenAllCharactersAreSame() {
        assertThat(new PartitionLabels().partitionLabels("aaaa")).containsExactly(4);
    }

    @Test
    public void shouldPartitionIntoTwoIndependentGroups() {
        assertThat(new PartitionLabels().partitionLabels("aabb")).containsExactly(2, 2);
    }
}
