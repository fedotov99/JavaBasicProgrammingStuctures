package com.netcracker;

public class SharpDrawer {
    public static void drawRectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
