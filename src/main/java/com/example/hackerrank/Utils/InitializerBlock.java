package com.example.hackerrank.Utils;

import java.util.Scanner;

public class InitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lebar = scanner.nextInt();
        int tinggi = scanner.nextInt();

        if (lebar <= 0 || tinggi <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(lebar*tinggi);
        }
    }
}
