package com.example.jse.m01.s10;

/**
 * A utility class for performing operations on matrices.
 * 
 * @author chiarafragomeli
 *
 */
public class MyMatrix {
    /**
     * Checks if a matrix contains empty values
     * 
     * @param matrix
     * @return true if matrix contains empty values, false if not
     */
    public static boolean containsEmpty(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a diagonal of a matrix
     * 
     * @param matrix
     * @return array containing the values
     */
    public static int[] diagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        if (matrix.length == 0) {
            return diagonal;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    /**
     * Returns a matrix where all values of the diagonal are swapped with 1
     * 
     * @param matrix
     * @return a matrix where all value of the diagonal are swapped with 1
     */
    public static void diagonalAllOne(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.print("[ ]");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    /**
     * Returns an array containing all values of the anti-diagonal
     * 
     * @param matrix
     * @return array containg all values of the anti-diagonal
     */
    public static int[] antiDiagonal(int[][] matrix) {
        if (matrix.length == 0) {
            int[] antiDiagonal = new int[matrix.length];
            return antiDiagonal;
        }
        if (matrix.length <= matrix[0].length) {
            int[] antiDiagonal = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) { // loop works if matrix is square or if row number < col number

                antiDiagonal[j] = matrix[j][(matrix[0].length - 1) - j];
            }
            return antiDiagonal;
        } else {
            int[] antiDiagonal = new int[matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) { // loop works if row number > col number

                antiDiagonal[j] = matrix[j][(matrix[0].length - 1) - j];
            }
            return antiDiagonal;
        }
    }

    /**
     * Prints a matrix where all values of the anti-diagonal are swapped with 1
     * 
     * @param matrix
     */
    public static void antiDiagonalAllOne(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.print("[ ]");
        } else {
            if (matrix.length <= matrix[0].length) {
                for (int j = 0; j < matrix.length; j++) { // loop works if matrix is square or number of row < number of
                                                          // col

                    matrix[j][(matrix[0].length - 1) - j] = 1;
                }

            } else {
                for (int j = 0; j < matrix[0].length; j++) { // loop works if row > number of col

                    matrix[j][(matrix[0].length - 1) - j] = 1;
                }

            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}