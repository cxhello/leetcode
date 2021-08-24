package com.cxhello.leetcode;

import java.util.*;

/**
 * @author cxhello
 * @date 2021/8/24
 */
public class Solution20 {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        int length = s.length() / 2;
        while (length > 0) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
            length --;
        }
        return s.isEmpty();
    }

    public boolean isValid2(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || !stack.peek().equals(map.get(c))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.isValid2("()"));
        System.out.println(solution20.isValid2("()[]{}"));
        System.out.println(solution20.isValid2("(]"));
        System.out.println(solution20.isValid2("([)]"));
        System.out.println(solution20.isValid2("{[]}"));
    }

}
