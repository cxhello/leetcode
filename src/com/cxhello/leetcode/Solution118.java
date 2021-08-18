package com.cxhello.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cxhello
 * @date 2021/8/18
 */
public class Solution118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
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
        return list;
    }

    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        System.out.println(solution118.generate(5));
    }

}
