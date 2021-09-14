package com.cxhello.leetcode;

import java.util.*;

/**
 * @author cxhello
 * @create 2021/9/14
 */
public class Solution524 {

    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        int size = dictionary.size();
        int result = 0;
        int flag = 0;
        for (int i = 0; i < size; i++) {
            String s1 = dictionary.get(i);
            int count = 0;
            int fromIndex = 0;
            for (int j = 0; j < s1.length(); j++) {
                char c = s1.charAt(j);
                int index = s.indexOf(c, fromIndex);
                if (index != -1) {
                    count++;
                    fromIndex = index + 1;
                } else {
                    count = 0;
                    fromIndex = 0;
                    break;
                }
            }
            if (count > result) {
                flag = i;
                result = count;
            }

        }
        if (result == 0) {
            return "";
        } else {
            return dictionary.get(flag);
        }
    }

    public static void main(String[] args) {
        Solution524 solution524 = new Solution524();
        solution524.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea"));
    }

}
