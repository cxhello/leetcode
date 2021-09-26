package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/9/26
 */
public class Solution371 {

    public int getSum(int a, int b) {
        while (b != 0){
            int flag = (a & b) << 1;
            a = a ^ b;
            b = flag;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution371 solution371 = new Solution371();
        solution371.getSum(2, 3);
    }

}
