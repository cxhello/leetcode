package com.cxhello.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cxhello
 * @create 2021/9/17
 */
public class Solution36 {

    public boolean isValidSudoku(char[][] board) {
        // TODO: 2021/9/17 待完善
        int length = board.length;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            char[] chars = board[i];
            char firstChar = chars[0];
            List<Character> rowList = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                char ch = chars[j];
                if (ch == '.') {
                    continue;
                }
                if (rowList.contains(chars[j])) {
                    return false;
                } else {
                    rowList.add(chars[j]);
                }
            }
            if (firstChar == '.') {
                continue;
            }
            if (list.contains(firstChar)) {
                return false;
            } else {
                list.add(firstChar);
            }
        }
        return true;
    }


    public boolean isValidSudoku2(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] list = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int blockIndex = i / 3 * 3 + j / 3;
                    if (row[i][num] || list[j][num] || grid[blockIndex][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                        list[j][num] = true;
                        grid[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Solution36 solution36 = new Solution36();
        solution36.isValidSudoku2(new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});
    }

}
