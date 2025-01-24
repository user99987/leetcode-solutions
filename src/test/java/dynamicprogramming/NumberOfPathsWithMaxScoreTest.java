package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumberOfPathsWithMaxScoreTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{7, 1},
                new NumberOfPathsWithMaxScore().pathsWithMaxScore(List.of("E23", "2X2", "12S")));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{4, 2},
                new NumberOfPathsWithMaxScore().pathsWithMaxScore(List.of("E12", "1X1", "21S")));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new int[]{0, 0},
                new NumberOfPathsWithMaxScore().pathsWithMaxScore(List.of("E11", "XXX", "11S")));
    }

}

