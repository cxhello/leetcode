package com.cxhello.leetcode;

import java.util.Arrays;

/**
 * @author cxhello
 * @date 2025/3/16
 */
public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }
        int total = m + n;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && i + n == total) {
                for (int j = 0; j < nums2.length; j++) {
                    nums1[i] = nums2[j];
                    i++;
                }
                break;
            }
        }
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Solution88 solution88 = new Solution88();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        solution88.merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

}
