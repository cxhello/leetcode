package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/23
 */
public class Solution326 {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n == 2) {
            return false;
        }
        if (n == 3) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        Solution326 solution326 = new Solution326();
        solution326.isPowerOfThree(27);
    }

}
