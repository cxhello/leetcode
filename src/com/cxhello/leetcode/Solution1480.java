package com.cxhello.leetcode;

import java.util.Arrays;

/**
 * @author cxhello
 * @create 2021/8/28
 */
public class Solution1480 {

    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] runningSum = new int[length];
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            runningSum[i] = sum;
        }
        return runningSum;
    }

    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution1480 solution1480 = new Solution1480();
        System.out.println(Arrays.toString(solution1480.runningSum2(new int[]{1, 2, 3, 4})));
    }

}
