package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/19
 */
public class Solution650 {

    public int minSteps(int n) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result = result + i;
                n = n / i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution650 solution650 = new Solution650();
        solution650.minSteps(3);
    }

}
