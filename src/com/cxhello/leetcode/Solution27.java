package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/8/25
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int[] nums = {3, 2, 2, 3};
        System.out.println(solution27.removeElement(nums, 3));
    }

}
