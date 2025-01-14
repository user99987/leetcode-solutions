package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Easy
 * <p>
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 * <p>
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 * <p>
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
 * <p>
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * <p>
 * Output: [-1,3,-1]
 * <p>
 * Explanation:
 * <p>
 * The next greater element for each value of nums1 is as follows:
 * <p>
 * 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * <p>
 * 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
 * <p>
 * 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * <p>
 * Example 2:
 * <p>
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * <p>
 * Output: [3,-1]
 * <p>
 * Explanation:
 * <p>
 * The next greater element for each value of nums1 is as follows:
 * <p>
 * 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
 * <p>
 * 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length <= nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 10^4
 * All integers in nums1 and nums2 are unique.
 * All the integers of nums1 also appear in nums2.
 */
public class NextGreaterElement {

    public static void main(String[] args) throws Exception {
        int[] A = {4, 1, 2};
        int[] B = {1, 3, 4, 2};
        int[] result = new NextGreaterElement().nextGreaterElement(A, B);
        System.out.println(Arrays.toString(result));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            indexMap.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int index = indexMap.get(num);
            if (index == nums2.length - 1) {
                nums1[i] = -1;
            } else {
                boolean found = false;
                while (index < nums2.length) {
                    if (nums2[index] > num) {
                        nums1[i] = nums2[index];
                        found = true;
                        break;
                    }
                    index++;
                }
                if (!found) {
                    nums1[i] = -1;
                }
            }
        }
        return nums1;
    }
}
