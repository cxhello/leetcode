package com.cxhello.leetcode.week;

/**
 * @author cxhello
 * @create 2021/9/5
 */
public class Week257 {

    public int countQuadruplets(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 3; i++) {
            for (int j = i + 1; j < length - 2; j++) {
                for (int k = i + 2; k < length - 1; k++) {
                    for (int l = i + 3; l < length; l++) {
                        if ((i < j) && (j < k) && (k < l)) {
                            int sum = nums[i] + nums[j] + nums[k];
                            if (sum == nums[l]) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Week257 week257 = new Week257();
        week257.countQuadruplets(new int[]{1, 2, 3, 6});
        week257.countQuadruplets(new int[]{1, 1, 1, 3, 5});
    }

}
