package com.example.hackerrank.Utils.Easy;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int compare = A.compareTo(B);

        System.out.println(A.length() + B.length());

        if(compare > 0){
            System.out.println("Yes");
        }
        if(compare <= 0){
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
