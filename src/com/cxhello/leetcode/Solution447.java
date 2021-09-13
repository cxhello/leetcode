package com.cxhello.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cxhello
 * @create 2021/9/13
 */
public class Solution447 {

    public int numberOfBoomerangs(int[][] points) {
        int length = points.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    int flag = (int) (Math.pow(points[j][0] - x1, 2) + Math.pow(points[j][1] - y1, 2));
                    map.put(flag, map.getOrDefault(flag, 0) + 1);
                }
            }
            for (Integer value : map.values()) {
                if (value > 1) {
                    // 计算回旋镖数量 有n个点距当前点距离相同 count = n * (n - 1)
                    count += value * (value - 1);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution447 solution447 = new Solution447();
        solution447.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}});
    }

}
