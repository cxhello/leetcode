package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/20
 */
public class Solution541 {

    public String reverseStr(String s, int k) {
        if (s.length() == 1) {
            return s;
        }
        if (s.length() <= k) {
            return new StringBuilder(s).reverse().toString();
        }
        int i = 0;
        int j = 2 * k;
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (length >= 2 * k) {
            String str = s.substring(i, j + i);
            stringBuilder.append(new StringBuilder(str.substring(0, k)).reverse());
            stringBuilder.append(str, k, j);
            length = length - j;
            i = i + j;
        }
        if (length > 0) {
            if (length < j && length >= k) {
                stringBuilder.append(new StringBuilder(s.substring(i, i + k)).reverse());
                stringBuilder.append(s, i + k, s.length());
            } else {
                stringBuilder.append(new StringBuilder(s.substring(i)).reverse());
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution541 solution541 = new Solution541();
        System.out.println(solution541.reverseStr("abcdefg", 2));
    }
}
