package com.example.hackerrank.Utils.Easy;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++) {
            String input1 = scanner.next();
            int a = scanner.nextInt();

            System.out.printf("%-15s%03d %n", input1, a);
        }
        System.out.println("================================");
    }
}
