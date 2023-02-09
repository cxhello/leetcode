package com.cxhello.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cxhello
 * @date 2023-02-09
 */
public class Solution136 {

    public int singleNumber(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                Integer count = map.get(key);
                map.put(key, count + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
    }

    public int singleNumber2(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            String keyStr = String.valueOf(key);
            if (list.contains(keyStr)) {
                list.remove(keyStr);
            } else {
                list.add(String.valueOf(key));
            }
        }
        return Integer.valueOf(list.get(0));
    }

    public int singleNumber3(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        Solution136 solution136 = new Solution136();
        System.out.println(solution136.singleNumber3(new int[]{2, 2, 1}));
        System.out.println(solution136.singleNumber3(new int[]{4, 1, 2, 1, 2}));
        System.out.println(solution136.singleNumber3(new int[]{1}));
    }

}
