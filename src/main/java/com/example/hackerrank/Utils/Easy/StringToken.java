package com.example.hackerrank.Utils.Easy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

        matcher.reset();
        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }

//        String[] data = s.split("[^A-Za-z]+");
//        System.out.println(datas.length);
//        for (String token : datas){
//            System.out.println(token);
//        }

        scanner.close();
    }
}
