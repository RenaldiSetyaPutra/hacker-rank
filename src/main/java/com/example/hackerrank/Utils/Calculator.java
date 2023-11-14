package com.example.hackerrank.Utils;

import java.util.Scanner;

public class Calculator {
    public static String Calculator(String str) {
        int hasil = 0;
        System.out.println(str);

//        System.out.println("Input Value Pertama");
//        int value1 = str.nextInt();
//
//        System.out.println("Input Value Kedua");
//        int value2 = str.nextInt();
//
//        System.out.println("Input Operator +, -, *, /");
//        char operator = str.next().charAt(0);
//
//        switch (operator) {
//            case '+':
//                hasil = value1 + value2;
//                return value1 + " + " + value2 + " = " + hasil;
//
//            case '-':
//                hasil = value1 + value2;
//                return value1 + " - " + value2 + " = " + hasil;
//
//            case '*':
//                hasil = value1 + value2;
//                return value1 + " * " + value2 + " = " + hasil;
//
//            case '/':
//                hasil = value1 + value2;
//                return  value1 + " / " + value2 + " = " + hasil;
//        }

        hasil = Integer.valueOf(str.replace("", ""));
        str = String.valueOf(hasil);
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Calculator(s.nextLine()));
    }
}
