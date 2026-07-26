package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfPathsWithMaxScoreTest {

    @Test
    public void shouldFindMaxScorePathWithObstacle() {
        assertThat(new NumberOfPathsWithMaxScore().pathsWithMaxScore(List.of("E23", "2X2", "12S"))).containsExactly(new int[]{7, 1});
    }

    @Test
    public void shouldFindMaxScorePathWithMultipleWaysToAchieveIt() {
        assertThat(new NumberOfPathsWithMaxScore().pathsWithMaxScore(List.of("E12", "1X1", "21S"))).containsExactly(new int[]{4, 2});
    }

    @Test
    public void shouldReturnZeroWhenNoPathExistsAroundObstacles() {
        assertThat(new NumberOfPathsWithMaxScore().pathsWithMaxScore(List.of("E11", "XXX", "11S"))).containsExactly(new int[]{0, 0});
    }

}

