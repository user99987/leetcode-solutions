package popular;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void testCase1() {
        assertEquals(new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size(), Arrays.asList(
                List.of("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        ).size());
    }

    @Test
    public void testCase2() {
        assertEquals(List.of(
                List.of("")
        ), new GroupAnagrams().groupAnagrams(new String[]{""}));
    }

    @Test
    public void testCase3() {
        assertEquals(List.of(
                List.of("a")
        ), new GroupAnagrams().groupAnagrams(new String[]{"a"}));
    }
}
