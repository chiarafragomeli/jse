package com.example.jse.m07.exampleEx;

public class Example {
    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty");
        }

        int max = array[0];

        for (int arrays : array) {
            if (max < arrays) {
                max = arrays;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };

        try {
            int m = max(array);

            System.out.println("The maximum value in my array is: " + m);

        } catch (Exception ex) {
            System.out.println(ex);
            return;

        }
    }
}
