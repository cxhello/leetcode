package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/15
 */
public class Solution69 {

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        long flag = x / 2;
        long i = flag * flag;
        while (i > x) {
            flag = flag / 2;
            i = flag * flag;
        }
        while (i < x) {
            flag++;
            i = flag * flag;
            if (i > x) {
                return (int) (flag - 1);
            }
        }
        return (int) flag;
    }

    public int mySqrt2(int x) {
        int start = 0;
        int end = x;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            long sum = (long) mid * mid;
            if (sum <= x) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution69 solution69 = new Solution69();
        solution69.mySqrt2(4);
    }

}
