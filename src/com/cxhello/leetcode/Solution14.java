package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/8/14
 */
public class Solution14 {

    public String longestCommonPrefix(String[] strs) {
        int flag = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[flag].length() < strs[i + 1].length()) {
                flag = i + 1;
            }
        }
        String maxStr = strs[flag];
        boolean mark = true;
        for (int i = 0; i < strs.length; i++) {
            int length = strs[i].length() < maxStr.length() ? strs[i].length() : maxStr.length();
            if (!strs[i].substring(0, length).contains(maxStr)) {
                mark = false;
            }
            if (i == strs.length - 1) {
                if (mark) {
                    break;
                } else {
                    i = -1;
                    mark = true;
                    maxStr = maxStr.substring(0, maxStr.length() - 1);
                }
            }
        }
        if (mark) {
            return maxStr;
        }
        return "";
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        String[] strArray = {"flower","flow","flight"};
        System.out.println(solution14.longestCommonPrefix(strArray));
    }

}
