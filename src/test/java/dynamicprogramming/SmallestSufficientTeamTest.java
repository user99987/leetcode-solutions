package dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallestSufficientTeamTest {

    @Test
    public void testCase1() {
        String[] reqSkills = {"java", "nodejs", "reactjs"};
        List<List<String>> people = Arrays.asList(
                List.of("java"),
                List.of("nodejs"),
                Arrays.asList("nodejs", "reactjs")
        );
        int[] result = new SmallestSufficientTeam().smallestSufficientTeam(reqSkills, people);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    public void testCase2() {
        String[] reqSkills = {"algorithms", "math", "java", "reactjs", "csharp", "aws"};
        List<List<String>> people = Arrays.asList(
                List.of("algorithms", "math", "java"),
                List.of("algorithms", "math", "reactjs"),
                List.of("java", "csharp", "aws"),
                List.of("reactjs", "csharp"),
                List.of("csharp", "math"),
                List.of("aws", "java")
        );
        int[] result = new SmallestSufficientTeam().smallestSufficientTeam(reqSkills, people);
        assertArrayEquals(new int[]{1, 2}, result);
    }

}
