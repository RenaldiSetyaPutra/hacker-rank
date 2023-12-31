package com.example.hackerrank.Utils.Easy;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i<t; i++){
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x == (byte) x){
                    System.out.println("* byte");
                }

                if (x == (short) x){
                    System.out.println("* short");
                }

                if (x == (int) x){
                    System.out.println("* int");
                }

                if (x == (long) x){
                    System.out.println("* long");
                }
            } catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
