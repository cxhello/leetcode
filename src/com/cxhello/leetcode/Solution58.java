package com.cxhello.leetcode;

/**
 * @author cxhello
 * @create 2021/8/21
 */
public class Solution58 {

    public int lengthOfLastWord(String s) {
        if (s.length() == 1 && !s.contains(" ")) {
            return 1;
        } else {
            int index = s.lastIndexOf(" ");
            while (index == s.length() - 1 && s.endsWith(" ")) {
                s = s.substring(0, index);
                index = s.lastIndexOf(" ");
            }
            return s.substring(index + 1).length();
        }
    }

    public static void main(String[] args) {
        Solution58 solution58 = new Solution58();
        System.out.println(solution58.lengthOfLastWord("Hello World"));
        System.out.println(solution58.lengthOfLastWord("   fly me   to   the moon   "));
    }

}
