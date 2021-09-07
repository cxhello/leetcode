package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/7
 */
public class Solution1221 {

    public int balancedStringSplit(String s) {
        char[] charArray = s.toCharArray();
        int count = 0;
        int flag = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'L') {
                flag++;
            } else {
                flag--;
            }
            if (flag == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution1221 solution1221 = new Solution1221();
        solution1221.balancedStringSplit("RLRRLLRLRL");
    }

}
