package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (checkHorizontal(board, index) || checkVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean result = true;
        for (int[] array : board) {
            if (array[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
