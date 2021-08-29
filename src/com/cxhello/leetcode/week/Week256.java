package com.cxhello.leetcode.week;

import java.util.Arrays;

/**
 * 第 256 场周赛
 * @author cxhello
 * @create 2021/8/29
 */
public class Week256 {

    /**
     * 第一题
     * @param nums
     * @param k
     * @return
     */
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length;
        int max = nums[k - 1] - nums[0];
        for(int i = 0; i + k - 1 < length; i++){
            max = Math.min(max, nums[i + k - 1] - nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Week256 week256 = new Week256();
        System.out.println(week256.minimumDifference(new int[]{9, 4, 1, 7}, 3));
    }

}
