package com.example.hackerrank.Utils;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String result = s.substring(start,end);
        System.out.println(result);
    }
}