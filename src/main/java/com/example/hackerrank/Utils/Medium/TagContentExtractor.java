package com.example.hackerrank.Utils.Medium;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases>0){
            String line = scanner.nextLine();
            find(line);
            testCases--;
        }
    }

    public static void find(String line){

//        Pattern pattern = Pattern.compile("<[^>]+>|([^<]+)");
//        Matcher matcher = pattern.matcher(line);
//        Stack<String> tagStack = new Stack<>();
//        StringBuilder text = new StringBuilder();
//
//        while (matcher.find()) {
//            String token = matcher.group();
//            if (token.startsWith("<")) {
//                if (token.startsWith("</")) {
//                    tagStack.pop();
//                } else {
//                    tagStack.push(token);
//                }
//            } else {
//                if (tagStack.isEmpty()) {
//                    text.append(token).append("\n");
//                }
//            }
//        }
//        System.out.print(text.length() > 0 ? text : "None\n");
    }
}
