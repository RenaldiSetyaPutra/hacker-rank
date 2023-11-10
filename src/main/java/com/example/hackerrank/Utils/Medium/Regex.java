package com.example.hackerrank.Utils.Medium;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String ip = scanner.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex{
    public String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]|0)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]|0)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]|0)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]|0)$";

}
