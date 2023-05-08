package com.example.jse.m01.s10;

import java.util.Arrays;

public class MatrixExtraEx {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // TODO how to manage if int[][] matrix = { {0}, {0} } ?
        //
        // NB: matrix.length = number of ROW // matrix[0].length = number of COLUMNS
        // (assuming all rows have the same length)
        //

        if (MyMatrix.containsEmpty(matrix) == true) {
            System.out.println("I need a matrix!");
        } else {
            //
            System.out.println("My matrix is:\n" + Arrays.deepToString(matrix));
            //
            System.out.println("\nMy diagonal is:\n" + Arrays.toString(MyMatrix.diagonal(matrix)));
            //
            System.out.println("\nMy new matrix is:");
            MyMatrix.diagonalAllOne(matrix);
            //
            System.out.println("\nMy anti-diagonal is:\n" + Arrays.toString(MyMatrix.antiDiagonal(matrix)));
            //
            System.out.println("\nMy new matrix is:");
            MyMatrix.antiDiagonalAllOne(matrix);
        }
    }
}
