package com.cxhello.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cxhello
 * @date 2021/9/9
 */
public class Solution68 {

    private List<List<String>> assembleList(String[] words, int maxWidth) {
        int length = 0;
        int count = 0;
        List<List<String>> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            length += words[i].length();
            count += 1;
            list2.add(words[i]);
            if (length + count - 1 > maxWidth) {
                list2.remove(count - 1);
                length = 0;
                count = 0;
                list.add(list2);
                list2 = new ArrayList<>();
                i = i - 1;
                continue;
            }
        }
        if (!list2.isEmpty()) {
            list.add(list2);
        }
        return list;
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultList = new ArrayList<>();
        List<List<String>> list = assembleList(words, maxWidth);
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            int size = list.get(i).size();
            int len = 0;
            for (String string : list.get(i)) {
                len += string.length();
            }
            // 最后一个单词组
            if (i == list.size() - 1) {
                for (int j = 0; j < size; j++) {
                    sb.append(list.get(i).get(j));
                    if (j == size - 1) {
                        int x = maxWidth - sb.length();
                        if (x > 0) {
                            for (int k = 0; k < x; k++) {
                                sb.append(" ");
                            }
                        }
                    } else {
                        sb.append(" ");
                    }
                }
            } else {
                int quotient = 0;
                int remainder = 0;
                if (size - 1 > 0) {
                    quotient = (maxWidth - len) / (size - 1);
                    remainder = (maxWidth - len) % (size - 1);
                }
                for (int j = 0; j < size; j++) {
                    sb.append(list.get(i).get(j));
                    if (j != size - 1) {
                        for (int k = 0; k < quotient; k++) {
                            sb.append(" ");
                        }
                    }
                    if (remainder != 0) {
                        sb.append(" ");
                        remainder--;
                    }
                    if (j == size - 1) {
                        int number = maxWidth - sb.length();
                        if (number > 0) {
                            for (int k = 0; k < number; k++) {
                                sb.append(" ");
                            }
                        }
                    }
                }
            }
            resultList.add(sb.toString());
        }
        return resultList;
    }

    public static void main(String[] args) {
        Solution68 solution68 = new Solution68();
        solution68.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
    }

}
