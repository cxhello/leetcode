package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/13
 */
public class Solution9 {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String[] split = str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
        }
        if (str.equals(sb.toString())) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome2(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int y = x;
        int reverseNumber = 0;
        while (x != 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x = x / 10;
        }
        return reverseNumber == y;
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome2(121));
    }

}
