package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return (checkHorizontal(board) || checkVertical(board));
    }
    public static boolean checkVertical(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 1) {
                    count++;
                }
            }
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    count++;
                }
            }
            if (count == 5) {
                return true;
            }
        }
        return false;
    }
}
