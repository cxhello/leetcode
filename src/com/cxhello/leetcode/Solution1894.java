package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/10
 */
public class Solution1894 {

    public int chalkReplacer(int[] chalk, int k) {
        int length = chalk.length;
        while (k > 0) {
            for (int i = 0; i < length; i++) {
                k = k - chalk[i];
                if (k < 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    public int chalkReplacer2(int[] chalk, int k) {
        int length = chalk.length;
        long sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + chalk[i];
        }
        k = (int) (k % sum);
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (k < chalk[i]) {
                result = i;
                break;
            }
             k = k - chalk[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1894 solution1894 = new Solution1894();
        solution1894.chalkReplacer2(new int[]{5, 1, 5}, 22);
    }

}
