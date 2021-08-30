package com.cxhello.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cxhello
 * @date 2021/8/30
 */
public class Solution13 {

    private static final Map<Character, Integer> MAP = new HashMap<>();

    static {
        MAP.put('I', 1);
        MAP.put('V', 5);
        MAP.put('X', 10);
        MAP.put('L', 50);
        MAP.put('C', 100);
        MAP.put('D', 500);
        MAP.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            Integer number = MAP.get(c);
            if (i != length -1 && c == 'I' && (charArray[i + 1] == 'V' || charArray[i + 1] == 'X')) {
                number = -number;
            }
            if (i != length -1 && c == 'X' && (charArray[i + 1] == 'L' || charArray[i + 1] == 'C')) {
                number = -number;
            }
            if (i != length -1 && c == 'C' && (charArray[i + 1] == 'D' || charArray[i + 1] == 'M')) {
                number = -number;
            }
            sum += number;
        }
        return sum;
    }

    public int romanToInt2(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            int number = MAP.get(c);
            if (i < length -1 && number < (MAP.get(charArray[i + 1]))) {
                number = -number;
            }
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        solution13.romanToInt2("III");
    }

}
