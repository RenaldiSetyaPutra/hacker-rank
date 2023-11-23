package com.example.hackerrank.Utils.Medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile("<(.+)>(([^<>]+))</\\1>");
            Matcher matcher = pattern.matcher(line);

            if (!matcher.find()) {
                System.out.println("None");
            }

            matcher.reset();

            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
            testCases--;
        }
    }
}
