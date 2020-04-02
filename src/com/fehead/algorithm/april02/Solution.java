package com.fehead.algorithm.april02;

import java.util.Arrays;

/**
 * @author Nightnessss 2020/4/2 22:29
 */
public class Solution {
    public void gameOfLife(int[][] board) {

        int x = board[0].length;
        int y = board.length;
        int[][] box = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                box[i][j] = getValue(i-1, j-1, board) + getValue(i+1, j+1, board) + getValue(i, j-1, board) +
                        getValue(i-1, j, board) + getValue(i+1, j-1, board) + getValue(i-1, j+1, board) +
                        getValue(i, j+1, board) + getValue(i+1, j, board);

            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                switch (box[i][j]) {
                    case 2:
                        break;
                    case 3:
                        board[i][j] = 1;
                        break;
                    default:
                        board[i][j] = 0;
                }
            }
        }
//        System.out.println(Arrays.deepToString(board_));

    }

    private int getValue(int i, int j, int[][]board) {
        int x = board[0].length;
        int y = board.length;
        if (i < 0 || j < 0 || i >= y || j >= x) {
            return 0;
        } else {
            return board[i][j];
        }
    }
}
