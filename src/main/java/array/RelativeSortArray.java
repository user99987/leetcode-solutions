package array;

import java.util.Arrays;

/**
 * Easy
 * <p>
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * <p>
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * <p>
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * <p>
 * Example 2:
 * <p>
 * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
 * <p>
 * Output: [22,28,8,6,17,44]
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * All the elements of arr2 are distinct.
 * Each arr2[i] is in arr1.
 */
public class RelativeSortArray {

    public static void main(String[] args) throws Exception {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = new RelativeSortArray().relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];
        for (int a : arr1) {
            map[a]++;
        }
        int i = 0;
        for (int b : arr2) {
            while (map[b] != 0) {
                map[b]--;
                arr1[i] = b;
                i++;
            }
        }
        for (int j = 0; j < map.length; j++) {
            while (map[j] != 0) {
                arr1[i] = j;
                map[j]--;
                i++;
            }
        }
        return arr1;
    }
}
