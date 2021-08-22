package com.cxhello.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cxhello
 * @create 2021/8/22
 */
public class Solution119 {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> integerList = new ArrayList<>(i);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    integerList.add(1);
                } else {
                    List<Integer> tempList = list.get(i - 1);
                    integerList.add(tempList.get(j - 1) + tempList.get(j));
                }
            }
            list.add(integerList);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        Solution119 solution119 = new Solution119();
        System.out.println(solution119.getRow(3));
    }

}
