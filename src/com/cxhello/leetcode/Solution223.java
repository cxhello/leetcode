package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/30
 */
public class Solution223 {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int i = (ax2 - ax1) * (ay2 - ay1);
        int j = (bx2 - bx1) * (by2 - by1);
        int result = i + j;
        if (ax1 > bx2 || ax2 < bx1 || ay1 > by2 || ay2 < by1) {
            return result;
        }
        result = result - (Math.min(ax2, bx2) - Math.max(ax1, bx1)) * (Math.min(ay2, by2) - Math.max(ay1, by1));
        return result;
    }

    public static void main(String[] args) {
        Solution223 solution223 = new Solution223();
        solution223.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
    }

}
