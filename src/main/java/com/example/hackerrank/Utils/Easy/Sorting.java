package com.example.hackerrank.Utils.Easy;

import java.util.Arrays;
import java.util.Locale;

public class Sorting {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase(Locale.ROOT));
        System.out.println(a.toUpperCase(Locale.ROOT));

        int[] list = {4,2,3,5,1,6};
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
