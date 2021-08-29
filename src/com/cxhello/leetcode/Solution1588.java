package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/8/29
 */
public class Solution1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; i + j <= length; j += 2) {
                int end = i + j - 1;
                for (int k = i; k<= end; k++) {
                    sum+= arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution1588 solution1588 = new Solution1588();
        System.out.println(solution1588.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }

}
