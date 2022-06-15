package com.cxhello.leetcode;

/**
 * @author cxhello
 * @date 2022/6/15
 */
public class Solution67 {

    public String addBinary(String a, String b) {
        int i = a.length() - b.length();
        int abs = Math.abs(i);
        StringBuilder appendStr = new StringBuilder();
        for (int i1 = 0; i1 < abs; i1++) {
            appendStr.append("0");
        }
        if (i > 0) {
            b = new StringBuilder().append(appendStr).append(b).toString();
        }
        if (i < 0) {
            a = new StringBuilder().append(appendStr).append(a).toString();
        }
        int length = a.length();
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        String[] split1 = a.split("");
        String[] split2 = b.split("");
        for (int j = length - 1; j >= 0; j--) {
            String s1 = split1[j];
            String s2 = split2[j];
            int c3 = Integer.parseInt(s1) +  Integer.parseInt(s2) + flag;
            if (c3 >= 2) {
                if (c3 == 2) {
                    sb.append(0);
                } else {
                    sb.append(0 + flag);
                }
                flag = 1;
            } else {
                sb.append(c3);
                flag = 0;
            }
        }
        if (flag == 1) {
            sb.append(flag);
        }
        return sb.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        solution67.addBinary2("11" , "1");
        solution67.addBinary("1010" , "1011");
        solution67.addBinary("1111" , "1111");
        solution67.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101" , "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
    }

}
