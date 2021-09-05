package com.cxhello.leetcode;

import java.util.Random;

/**
 * @author cxhello
 * @create 2021/9/5
 */
public class Solution470 {

    public int rand7() {
        return new Random().nextInt(7);
    }

    public int rand10() {
        while (true) {
            int a = rand7();
            int b = rand7();
            int result = (a - 1) * 7 + b;
            if (result <= 40) {
                return result % 10 + 1;
            }
            a = result - 40;
            b = rand7();
            result = (a - 1) * 7 + b;
            if (result <= 60) {
                return result % 10 + 1;
            }

            a = result - 60;
            b = rand7();
            result = (a - 1) * 7 + b;
            if (result <= 20) {
                return result % 10 + 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution470 solution470 = new Solution470();
        System.out.println(solution470.rand10());
    }

}
