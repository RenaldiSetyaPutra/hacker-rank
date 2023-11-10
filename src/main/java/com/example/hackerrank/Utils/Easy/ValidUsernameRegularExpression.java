package com.example.hackerrank.Utils.Easy;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- !=0){
            String username = scanner.nextLine();

            if (username.matches(UsernameValidator.regularExpression)){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    class UsernameValidator{
        public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    }
}
