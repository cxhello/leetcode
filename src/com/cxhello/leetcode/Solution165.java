package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/1
 */
public class Solution165 {

    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int r1 = split1.length;
        int r2 = split2.length;
        int length = Math.max(r1, r2);
        for (int i = 0; i < length; i++) {
            int x = 0;
            int y = 0;
            if (i < r1) {
                x = Integer.parseInt(split1[i]);
            }
            if (i < r2) {
                y = Integer.parseInt(split2[i]);
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution165 solution165 = new Solution165();
        solution165.compareVersion("1.01", "1.001");
    }

}
