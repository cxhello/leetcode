package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/8/15
 */
public class Solution26 {

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] nums = {1, 1, 2};
        System.out.println(solution26.removeDuplicates(nums));
    }

}
