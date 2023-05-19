package com.example.jse.m10.s05.esercizio;

import java.util.ArrayDeque;

public class Esercizio {

    public static void main(String[] args) {
        String s = "Ciao a tutti!";
        // voglio invertire la stringa senza StringBuilder "!ittut a oaiC"
        ArrayDeque<Character> buffer = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            buffer.push(s.charAt(i)); // push -> aggiungere i caratteri
        }
        System.out.println(buffer);

//        while (buffer.size() > 0) {
//            System.out.println(buffer.pop()); // pop -> elimina i caratteri
//        }

        while (buffer.size() > 0) {
            buffer.pop();        
            System.out.println(buffer);
        }

    }

}
