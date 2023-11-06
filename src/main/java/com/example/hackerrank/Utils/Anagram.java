package com.example.hackerrank.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
        }

        char[] charArray1 = a.toLowerCase().toCharArray();
        char[] charArray2 = b.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean isAnagram = Arrays.equals(charArray1, charArray2);
        if (!isAnagram){
            System.out.println("Not Anagrams");
        }
        if (isAnagram){
            System.out.println("Anagrams");
        }
    }
}
