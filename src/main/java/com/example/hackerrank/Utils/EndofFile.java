package com.example.hackerrank.Utils;

import java.util.Scanner;

public class EndofFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNextLine()){
            String input1 = scanner.nextLine();
            System.out.println(lineNumber +  " " + input1);
            lineNumber++;
        }
        scanner.close();
    }
}
