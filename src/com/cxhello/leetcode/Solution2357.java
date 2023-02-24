package com.cxhello.leetcode;

import java.util.Arrays;

/**
 * @author cxhello
 * @date 2023-02-24
 */
public class Solution2357 {

    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int flag = nums[0] == 0 ? 0 : 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] != nums[i - 1]) {
                flag++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution2357 solution2357 = new Solution2357();
        System.out.println(solution2357.minimumOperations(new int[]{1, 5, 0, 3, 5}));
        System.out.println(solution2357.minimumOperations(new int[]{0}));
        System.out.println(solution2357.minimumOperations(new int[]{1}));
    }

}
