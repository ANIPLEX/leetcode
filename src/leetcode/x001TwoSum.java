package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class x001TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length <= 1) {
            return new int[2];
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // key = target - nums[i], just one solution
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer v = map.get(nums[i]);

            // can't use itself
            if (v != null && v != i) {
                return new int[] { i + 1, v + 1 };
            }
        }

        return null;
    }
}
