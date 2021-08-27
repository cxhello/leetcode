package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/27
 */
public class Solution35 {

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        int length = nums.length;
        if (target > nums[length - 1]) {
            return length;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                index++;
            }
        }
        return index;
    }

    public int searchInsert2(int[] nums, int target) {
        int length = nums.length;
        int index = 0;
        int end = length - 1;
        while (index <= end) {
            int mid = index + (end - index) / 2;
            if (target > nums[mid]) {
                index = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        System.out.println(solution35.searchInsert2(new int[]{1, 3, 5, 6}, 5));
    }
}
