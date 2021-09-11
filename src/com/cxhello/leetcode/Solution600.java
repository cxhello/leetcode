package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/9/11
 */
public class Solution600 {

    public int findIntegers(int n) {
        if (n < 3) {
            return n + 1;
        }
        if (n < 5) {
            return n;
        }
        int result = 5;
        for (int i = n; i > 5; i--) {
            if ((i & i << 1) > 0) {
                continue;
            }
            result += 1;
        }
        return result;
    }

    public int findIntegers2(int n) {
        int[] dp = new int[31];
        dp[0] = dp[1] = 1;
        for (int i = 2; i < 31; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int pre = 0, res = 0;
        for (int i = 29; i >= 0; --i) {
            int val = 1 << i;
            if ((n & val) != 0) {
                res += dp[i + 1];
                if (pre == 1) {
                    break;
                }
                pre = 1;
            } else {
                pre = 0;
            }

            if (i == 0) {
                ++res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution600 solution600 = new Solution600();
        solution600.findIntegers2(5);
    }

}
