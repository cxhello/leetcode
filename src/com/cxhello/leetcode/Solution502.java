package com.cxhello.leetcode;

import java.util.*;

/**
 * @author cxhello
 * @date 2021/9/8
 */
public class Solution502 {

    public int findMaximizedCapital3(int k, int w, int[] profits, int[] capital) {
        int length = profits.length;
        int[][] arr = new int[length][2];
        for (int i = 0; i < length; ++i) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr, (o1, o2) -> o1[0] == o2[0]? o2[1] - o1[1] : o1[0] - o2[0]);
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for (int i = 0; i < k; ++i) {
            while (count < length && arr[count][0] <= w) {
                pq.add(arr[count][1]);
                count++;
            }
            if (!pq.isEmpty()) {
                w += pq.poll();
            } else {
                break;
            }
        }

        return w;
    }

    public static void main(String[] args) {
        Solution502 solution502 = new Solution502();
        solution502.findMaximizedCapital3(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1});
    }

}
