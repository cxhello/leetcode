package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/8/16
 */
public class Solution70 {

    /**
     * 递归超出时间限制
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }

    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs2(3));
    }

}
