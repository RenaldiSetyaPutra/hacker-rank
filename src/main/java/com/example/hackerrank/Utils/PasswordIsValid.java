package com.example.hackerrank.Utils;

import java.util.Scanner;

public class PasswordIsValid {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimplePassword(s.nextLine()));
    }

    public static String SimplePassword(String str) {
        // code goes here
        boolean isValid = true;
        if(str.length() < 8 || str.length() > 30){
            isValid = false;
            str = String.valueOf(isValid);
        }

        if(str.toLowerCase().contains("password")){
            isValid = false;
            str = String.valueOf(isValid);
        }

        str = String.valueOf(isValid);
        return str;
    }
}
