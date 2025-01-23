package popular;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLadderTest {

    @Test
    public void testCase1() {
        assertEquals(5, new WordLadder().ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new WordLadder().ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }
}
