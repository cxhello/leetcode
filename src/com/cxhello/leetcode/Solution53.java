package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/31
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int result = nums[0];
        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int j = i; j < length; j++) {
                max += nums[j];
                result = Math.max(result, max);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        solution53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }

}
