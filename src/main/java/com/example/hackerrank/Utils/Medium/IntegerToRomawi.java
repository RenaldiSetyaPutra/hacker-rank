package com.example.hackerrank.Utils.Medium;

import java.util.Scanner;

public class IntegerToRomawi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println(intToRomawi(value));
    }

    public static String intToRomawi(int value){
        String[] thousand = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXXX", "XC"};
        String[] unit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String th = thousand[value / 1000];
        String h = hundreds[(value % 1000) / 100];
        String t = tens[(value % 100) / 10];
        String u = unit[value % 10];

//        return thousand[value / 1000] + hundreds[(value % 1000) / 100] + tens[(value % 100) / 10] + unit[value % 10];
        return th + h + t + u;
    }
}
