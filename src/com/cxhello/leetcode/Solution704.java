package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/6
 */
public class Solution704 {

    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution704 solution704 = new Solution704();
        solution704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        solution704.search2(new int[]{-1, 0, 3, 5, 9, 12}, 9);
    }

}
