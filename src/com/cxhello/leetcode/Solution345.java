package com.cxhello.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cxhello
 * @date 2021/8/18
 */
public class Solution345 {

    public String reverseVowels(String s) {
        String vowelStr = "aeiouAEIOU";
        String[] split = s.split("");
        int a = 0, b = split.length - 1;
        while (a <= b) {
            while (!vowelStr.contains(split[a].toLowerCase()) && a < b) {
                a++;
            }
            while (!vowelStr.contains(split[b].toLowerCase()) && a < b) {
                b--;
            }
            if (a < b) {
                String tempStr = split[a];
                split[a] = split[b];
                split[b] = tempStr;
            }
            a++;
            b--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            stringBuilder.append(split[i]);
        }
        return stringBuilder.toString();
    }

    public String reverseVowels2(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        char[] charArray = s.toCharArray();
        int a = 0, b = charArray.length - 1;
        while (a <= b) {
            while (!set.contains(charArray[a]) && a < b) {
                a++;
            }
            while (!set.contains(charArray[b]) && a < b) {
                b--;
            }
            if (a < b) {
                char tempChar = charArray[a];
                charArray[a] = charArray[b];
                charArray[b] = tempChar;
            }
            a++;
            b--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution345 solution345 = new Solution345();
        System.out.println(solution345.reverseVowels2("hello"));
    }

}
