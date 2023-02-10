package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2023-02-10
 */
public class Solution125 {

    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int number = c;
            if ((number >= 48 && number <= 57) || (number >= 97 && number <= 122)) {
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }


    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution125.isPalindrome("race a car"));
        System.out.println(solution125.isPalindrome(" "));
        System.out.println(solution125.isPalindrome("0P"));
    }

}
