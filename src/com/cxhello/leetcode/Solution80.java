package com.cxhello.leetcode;

/**
 * @author caixiaohui
 * @date 2021/8/26
 */
public class Solution80 {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return length;
        }
        int index = 2;
        for (int i = 2; i < length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution80 solution80 = new Solution80();
        System.out.println(solution80.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

}
