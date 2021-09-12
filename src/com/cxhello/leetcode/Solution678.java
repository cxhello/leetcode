package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/9/12
 */
public class Solution678 {

    public boolean checkValidString(String s) {
        int length = s.length();
        if (length == 1 && !s.contains("*")) {
            return false;
        }
        int left = 0;
        int wildcard = 0;
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if ('(' == ch) {
                left++;
            } else if ('*' == ch) {
                wildcard++;
            } else {
                if (left > 0) {
                    left--;
                } else if (wildcard > 0) {
                    wildcard--;
                } else {
                    return false;
                }
            }
        }
        left = 0;
        wildcard = 0;
        for(int i = length - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (')' == ch) {
                left++;
            }
            else if('*' == ch) {
                wildcard++;
            } else {
                if (left > 0) {
                    left--;
                } else if (wildcard > 0) {
                    wildcard--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution678 solution678 = new Solution678();
        solution678.checkValidString("()");
    }

}
