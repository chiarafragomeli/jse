/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s06.ex;

public class Exercise {
//    private static final int GAP = 'a' - 'A';     // charset independent 
//    private static final int ALPHABET_SIZE = 26;  // standard alphabet

    /**
     * A simpler version of String.toUpperCase()
     * 
     * Build the result in a StringBuilder, then convert it to String and return it
     * 
     * Do not use any method in String!
     * 
     * @param s a string, possibly empty or even null
     * @return uppercase version of input
     */
    public String toUpper(String s) {
        if(s == null) {
            return null;
        }
        StringBuilder strUp = new StringBuilder();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c -= ('a' - 'A'));
            }
            strUp.append(c);
        }
        return strUp.toString();
    }

    /**
     * Encrypt an uppercase string using the Caesar's algorithm
     * 
     * @param s     a string (uppercase only)
     * @param shift encrypting key
     * @return the encrypted string
     */
    public String caesarEncrypt(String s, int shift) {
        StringBuilder caesar = new StringBuilder();
        char c = ' ';
        if (shift < 0) {
            shift = 26 + (shift % 26);
          }
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            c = (char) ((c - 'A' + shift) % 26 + 'A');
            caesar.append(c);
        }
        return caesar.toString();

    }
}
