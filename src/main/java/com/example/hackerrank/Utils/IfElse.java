package com.example.hackerrank.Utils;

import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N%2 != 0){
            System.out.println("Weird");
        }

        if (N%2 == 0 && (N>2 && N<6)){
            System.out.println("Not Weird");
        }

        if (N%2 == 0 && (N>5 && N<21)){
            System.out.println("Weird");
        }

        if (N%2 == 0 && N>20){
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
