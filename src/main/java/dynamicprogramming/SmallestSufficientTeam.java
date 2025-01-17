package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
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
 * Input: req_skills = [“java”,”nodejs”,”reactjs”], people = [[“java”],[“nodejs”],[“nodejs”,”reactjs”]]
 * <p>
 * Output: [0,2]
 * <p>
 * Example 2:
 * <p>
 * Input: req_skills = [“algorithms”,”math”,”java”,”reactjs”,”csharp”,”aws”], people = [[“algorithms”,”math”,”java”],[“algorithms”,”math”,”reactjs”],[“java”,”csharp”,”aws”],[“reactjs”,”csharp”],[“csharp”,”math”],[“aws”,”java”]]
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

    private List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        String[] req = {"java", "nodejs", "reactjs"};
        List<List<String>> people = new ArrayList<>();
        people.add(Arrays.asList("java"));
        people.add(Arrays.asList("nodejs"));
        people.add(Arrays.asList("nodejs", "reactjs"));
        int[] R = new SmallestSufficientTeam().smallestSufficientTeam(req, people);
        for (int r : R) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    public int[] smallestSufficientTeam(String[] skills, List<List<String>> people) {
        int n = skills.length;
        int m = people.size();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(skills[i], i);
        }
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            List<String> list = people.get(i);
            int val = 0;
            for (String skill : list) {
                val |= 1 << map.get(skill);
            }
            arr[i] = val;
        }
        boolean[] banned = new boolean[m];
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int val = arr[i] | arr[j];
                if (val == arr[i]) {
                    banned[j] = true;
                } else if (val == arr[j]) {
                    banned[i] = true;
                }
            }
        }
        helper(0, n, arr, new ArrayList<>(), banned);
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    private void helper(int cur, int n, int[] arr, List<Integer> list, boolean[] banned) {
        if (cur == (1 << n) - 1) {
            if (ans.isEmpty() || ans.size() > list.size()) {
                ans = new ArrayList<>(list);
            }
            return;
        }
        if (!ans.isEmpty() && list.size() >= ans.size()) {
            return;
        }
        int zero = 0;
        while (((cur >> zero) & 1) == 1) {
            zero++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (banned[i]) {
                continue;
            }
            if (((arr[i] >> zero) & 1) == 1) {
                list.add(i);
                helper(cur | arr[i], n, arr, list, banned);
                list.remove(list.size() - 1);
            }
        }
    }
}
