package popular;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class WordLadderTest {

    @Test
    public void testCase1() {
        assertThat(new WordLadder().ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog"))).isEqualTo(5);
    }

    @Test
    public void testCase2() {
        assertThat(new WordLadder().ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log"))).isEqualTo(0);
    }
}
