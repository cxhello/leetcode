package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/11/15
 */
public class Solution319 {

    public int bulbSwitch(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Solution319 solution319 = new Solution319();
        solution319.bulbSwitch(3);
    }

}
