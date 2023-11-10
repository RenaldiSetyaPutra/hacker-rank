package com.example.hackerrank.Utils.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i<11; i++){
            System.out.println(
                    value + " " + "x" + " " + i + " = " + value*i
            );
        }

        bufferedReader.close();
    }
}
