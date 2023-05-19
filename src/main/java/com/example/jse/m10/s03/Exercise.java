/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Three exercises. Compare int[] and List&lt;Integer&gt; behavior
 */
public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int[] arrayResult = exercise.evensRaw(array);
        System.out.println("Without list: " + Arrays.toString(arrayResult));

        List<Integer> list = List.of(9, 8, 7, 6, 5, 4, 3, 2, 1); // inizializzazione lista immutabile
        List<Integer> listResult = exercise.evens(list);
        System.out.println("With list: " + listResult);

        List<Integer> list2 = List.of(9, 8, 9, 5, 5, 4, 3, 3, 1, 7);
        List<Integer> list2Result = exercise.singles(list2);
        System.out.println("List without duplicated values: " + list2Result);
    }

    /**
     * Extract from input the even values and return them in an array
     * <p>
     * Examples:
     * <li>in {9, 2, 3, 4} -> out {2, 4}
     * <li>in {6, 2, 4, 2} -> out {2, 2, 4, 6}
     * <li>in {2, 3, 4, 6} -> out {2, 4, 6}
     * 
     * Do not use Collections in here!
     * 
     * @param data a bunch of integers
     * @return even values from input
     */
    public int[] evensRaw(int[] data) {
//        throw new UnsupportedOperationException("Not yet implemented"); // al momento non esiste il codice
        int len = 0;

        for (int curr : data) {
            if (curr % 2 == 0) {
                len++;
            }
        }
        int[] result = new int[len];

        for (int i = 0, j = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                result[j] = data[i];
                j++;
            }
        }
        return result;
    }

    /**
     * Extract from input the even values and return them
     * <p>
     * Example: in {2, 3, 4, 5} -> out {2, 4}
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     */
    public List<Integer> evens(List<Integer> data) {
//        throw new UnsupportedOperationException("Not yet implemented");
        List<Integer> result = new ArrayList<>();

        for (Integer curr : data) {
            if (curr % 2 == 0) {
                result.add(curr);
            }
        }
        return result;
    }

    /**
     * Extract non-duplicated values in input and return them in a list.
     * <p>
     * Example: in {5, 4, 2, 3, 7, 4, 5, 6} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public List<Integer> singles(List<Integer> data) {
//        throw new UnsupportedOperationException("Not yet implemented");
        List<Integer> result = new ArrayList<>();

        for (Integer curr : data) {
            if (count(data, curr) == 1) {
                result.add(curr);
            }
        }
        return result;
    }

    private int count(List<Integer> data, Integer target) {
        int count = 0;

        for (Integer curr : data) {
            if (curr.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
