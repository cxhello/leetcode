package com.cxhello.leetcode.offer;

/**
 * @author cxhello
 * @create 2021/9/4
 */
public class Solution10 {

    public long fib(int n) {
        if (n <= 1) {
            return n;
        }
        int f1 = 0;
        int f2 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = f1 + f2;
            result = result % 1000000007;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        solution10.fib(95);
    }

}
