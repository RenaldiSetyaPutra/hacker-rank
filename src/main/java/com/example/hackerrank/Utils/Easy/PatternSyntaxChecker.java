package com.example.hackerrank.Utils.Easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<loop; i++){
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
        }

//        while (loop>0){
//            String pattern = scanner.nextLine();
//            try {
//                Pattern.compile(pattern);
//                System.out.println("Valid");
//            }catch (Exception e){
//                System.out.println("Invalid");
//            }
//        }
    }
}
