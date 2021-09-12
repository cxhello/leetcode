package com.cxhello.leetcode.week;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cxhello
 * @create 2021/9/12
 */
public class Week258 {

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index != -1) {
            StringBuilder sb = new StringBuilder();
            String s1 = word.substring(0, index + 1);
            sb.append(s1).reverse();
            String s2 = word.substring(index + 1);
            sb.append(s2);
            return sb.toString();
        } else {
            return word;
        }
    }

    public long interchangeableRectangles(int[][] rectangles) {
        int length = rectangles.length;
        long count = 0;
        for (int i = 0; i < length; i++) {
            float x = rectangles[i][0];
            float y =  rectangles[i][1];
            float flag = y / x;
            for (int j = i + 1; j < length; j++) {
                float k = rectangles[j][0];
                float m =  rectangles[j][1];
                float res = m / k;
                if (flag == res) {
                    count++;
                }
            }
        }
        return count;
    }

    public long interchangeableRectangles2(int[][] rectangles) {
        int length = rectangles.length;
        long count = 0;
        Map<Double, Long> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            double x = rectangles[i][0];
            double y =  rectangles[i][1];
            double flag = y / x;
            long res = map.getOrDefault(flag, 0L);
            map.put(flag, res + 1);
        }
        for (Map.Entry<Double, Long> entry : map.entrySet()) {
            Long value = entry.getValue();
            if (value > 1) {
//                count += (value * (value - 1)) / 2;
                count += (value * value - value) / 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Week258 week258 = new Week258();
        week258.reversePrefix("abcdefd", 'd');
        week258.interchangeableRectangles2(new int[][]{{4, 8}, {3, 6}, {10, 20}, {15, 30}});

    }

}
