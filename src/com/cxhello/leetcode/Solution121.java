package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2023-02-10
 */
public class Solution121 {

    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();
        System.out.println(solution121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution121.maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(solution121.maxProfit(new int[]{2, 1, 2, 0, 1}));
        System.out.println(solution121.maxProfit(new int[]{3, 2, 6, 5, 0, 3}));
    }

}
