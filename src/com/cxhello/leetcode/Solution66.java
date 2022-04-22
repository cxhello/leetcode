package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2022/4/22
 */
public class Solution66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int result = digits[i];
            if (result != 9) {
                digits[i] = result + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        return array;
    }

    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        solution66.plusOne(new int[]{1, 2, 3});
        solution66.plusOne(new int[]{4, 3, 2, 1});
        solution66.plusOne(new int[]{0});
        solution66.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        solution66.plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6});
        solution66.plusOne(new int[]{9});
        solution66.plusOne(new int[]{9, 9});
    }

}
