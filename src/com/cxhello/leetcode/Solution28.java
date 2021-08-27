package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/27
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        System.out.println(solution28.strStr("hello", "ll"));
    }

}
