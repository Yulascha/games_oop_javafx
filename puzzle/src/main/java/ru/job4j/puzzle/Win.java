package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        return rsl;
    }

    public static boolean Horizontal(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board.length != '1') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean Vertical(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board.length != '1') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
