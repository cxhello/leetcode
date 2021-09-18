package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/18
 */
public class Solution292 {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        Solution292 solution292 = new Solution292();
        solution292.canWinNim(8);
    }

}
