package com.cxhello.leetcode.interview;

import java.util.Arrays;

/**
 * 面试题 17.14. 最小K个数
 * @author cxhello
 * @date 2021/9/3
 */
public class Solution14 {

    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        solution14.smallestK(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4);
    }

}
