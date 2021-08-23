package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/23
 */
public class Solution1646 {

    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];
        int x = n < 2 ? n : n / 2;
        for (int i = 0; i <= x; i++) {
            if (i < 2) {
                nums[i] = i;
            }
            int flag = 2 * i;
            if (flag >= 2 && flag <= n) {
                nums[2 * i] = nums[i];
            }
            if (flag + 1 >= 2 && flag + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums[n];
    }

    public int getMaximumGenerated2(int n) {
        if (n < 2) {
            return n;
        }
        int max = 1;
        int[] nums = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                nums[i] = i;
            }
            int flag = 2 * i;
            if (flag >= 2 && flag <= n) {
                nums[2 * i] = nums[i];
            }
            if (flag + 1 >= 2 && flag + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1646 solution1646 = new Solution1646();
        System.out.println(solution1646.getMaximumGenerated(7));
        System.out.println(solution1646.getMaximumGenerated2(7));
    }

}
