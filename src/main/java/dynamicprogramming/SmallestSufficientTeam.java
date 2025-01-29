package dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hard
 * <p>
 * In a project, you have a list of required skills req_skills, and a list of people. The ith person people[i] contains a list of skills that the person has.
 * <p>
 * Consider a sufficient team: a set of people such that for every required skill in req_skills, there is at least one person in the team who has that skill. We can represent these teams by the index of each person.
 * <p>
 * For example, team = [0, 1, 3] represents the people with skills people[0], people[1], and people[3].
 * Return any sufficient team of the smallest possible size, represented by the index of each person. You may return the answer in any order.
 * <p>
 * It is guaranteed an answer exists.
 * <p>
 * Example 1:
 * <p>
 * Input: req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
 * <p>
 * Output: [0,2]
 * <p>
 * Example 2:
 * <p>
 * Input: req_skills = ["algorithms","math","java","reactjs","csharp","aws"], people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
 * <p>
 * Output: [1,2]
 * <p>
 * Constraints:
 * <p>
 * 1 <= req_skills.length <= 16
 * 1 <= req_skills[i].length <= 16
 * req_skills[i] consists of lowercase English letters.
 * All the strings of req_skills are unique.
 * 1 <= people.length <= 60
 * 0 <= people[i].length <= 16
 * 1 <= people[i][j].length <= 16
 * people[i][j] consists of lowercase English letters.
 * All the strings of people[i] are unique.
 * Every skill in people[i] is a skill in req_skills.
 * It is guaranteed a sufficient team exists.
 */
public class SmallestSufficientTeam {

    public int[] smallestSufficientTeam(String[] skills, List<List<String>> people) {
        int n = skills.length, m = people.size();
        Map<String, Integer> skillIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            skillIndex.put(skills[i], i);
        }

        int[] personSkills = new int[m];
        for (int i = 0; i < m; i++) {
            int skillMask = 0;
            for (String skill : people.get(i)) {
                skillMask |= (1 << skillIndex.get(skill));
            }
            personSkills[i] = skillMask;
        }

        List<Integer>[] dp = new List[1 << n];
        dp[0] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int skillSet = personSkills[i];
            if (skillSet == 0) continue;
            for (int prev = (1 << n) - 1; prev >= 0; prev--) {
                if (dp[prev] == null) continue;
                int combined = prev | skillSet;
                if (dp[combined] == null || dp[prev].size() + 1 < dp[combined].size()) {
                    dp[combined] = new ArrayList<>(dp[prev]);
                    dp[combined].add(i);
                }
            }
        }

        return dp[(1 << n) - 1].stream().mapToInt(i -> i).toArray();
    }
}
