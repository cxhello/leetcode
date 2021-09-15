package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/15
 */
public class Solution162 {

    public int findPeakElement(int[] nums) {
        int length = nums.length;
        int index = 0;
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int k = i + 1;
            if (k == length && nums[i] > nums[j]) {
                return i;
            } else {
                if (nums[i] > nums[j] && nums[i] > nums[k]) {
                    return i;
                }
            }
        }
        return index;
    }

    public int findPeakElement2(int[] nums) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            int k = mid + 1;
            if (nums[mid] < nums[k]) {
                start = k;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Solution162 solution162 = new Solution162();
        solution162.findPeakElement2(new int[]{1, 2, 3, 1});
    }

}
