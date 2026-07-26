package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;


public class GroupAnagramsTest {

    @Test
    public void shouldGroupWordsByAnagramSets() {
        assertThat(Arrays.asList(
                List.of("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        ).size()).isEqualTo(new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size());
    }

    @Test
    public void shouldGroupSingleEmptyString() {
        assertThat(new GroupAnagrams().groupAnagrams(new String[]{""})).isEqualTo(List.of(
                List.of("")
        ));
    }

    @Test
    public void shouldGroupSingleCharacterWord() {
        assertThat(new GroupAnagrams().groupAnagrams(new String[]{"a"})).isEqualTo(List.of(
                List.of("a")
        ));
    }
}
