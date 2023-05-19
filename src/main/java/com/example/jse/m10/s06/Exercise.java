/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * HashSet exercise
 */
public class Exercise {
    /**
     * Given an integer collection, return another collection without any duplicate
     * value
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data a collection, possibly with duplicates
     * @return the original data stripped of duplicates
     */

    public static void main(String[] args) {
        List<Integer> list = List.of(12, 53, 12, 35);
        Exercise exercise = new Exercise();

        Collection<Integer> collection = exercise.singles(list);
        System.out.println(collection);
    }

    public Collection<Integer> singles(Collection<Integer> data) {
//        return new HashSet<>(data); //disordinato
        return new TreeSet<>(data); // ordinato
    }
}
