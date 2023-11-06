package com.example.hackerrank.Utils;

import java.util.Scanner;

public class InttoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int input = scanner.nextInt();
            String.valueOf(input);
            System.out.println("Good job");
        }catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
