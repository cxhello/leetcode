package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2021/8/17
 */
public class Solution551 {

    public boolean checkRecord(String s) {
        String[] split = s.split("");
        // 缺勤天数
        int absentCount = 0;
        for (int i = 0; i < split.length; i++) {
            if ("A".equals(split[i])) {
                absentCount++;
            }
            if (absentCount >= 2) {
                return false;
            }
            if ("L".equals(split[i]) && split.length > 2 && i + 2 < split.length) {
                if ("L".equals(split[i + 1]) && split[i + 1].equals(split[i + 2])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRecord2(String s) {
        if (s.length() == 1) {
            return true;
        }
        int a = s.indexOf("A");
        if (a != -1 && s.indexOf("A", a + 1) != -1) {
            return false;
        }
        if (s.contains("LLL")) {
            return false;
        }
        return true;
    }

    public boolean checkRecord3(String s) {
        int flag = s.indexOf("A");
        return (flag == -1 || flag == s.lastIndexOf("A")) && !s.contains("LLL");
    }

    public static void main(String[] args) {
        Solution551 solution551 = new Solution551();
        System.out.println(solution551.checkRecord2("PPALLP"));
    }

}
