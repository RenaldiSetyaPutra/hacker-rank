package com.example.hackerrank.Utils;

import java.util.List;
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i<input; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;

            for (int j  = 0; j <n; j++){
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
