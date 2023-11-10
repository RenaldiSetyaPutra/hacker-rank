package com.example.hackerrank.Utils.Easy;

import java.util.*;

public class Comparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for (int i = 0; i<=s.length() - k; i++){
            String subString = s.substring(i, i + k);

            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }

            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }
        System.out.println(smallest + "\n" + largest);
    }
}
