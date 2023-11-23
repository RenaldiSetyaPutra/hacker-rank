package com.example.hackerrank.Utils.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = {};
        while (n>0){
            int value = scanner.nextInt();
            int newArray[] = new int[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                newArray[i] = a[i];
            }
            newArray[a.length] = value;
            a = newArray;
            n--;
        }

        scanner.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
