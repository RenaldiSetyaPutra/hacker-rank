package com.example.hackerrank.Utils.Easy;

import java.util.Arrays;

public class MissingInt {
    public static void main(String[] args) {
        int[] value = {3,2,5,4,7,9,6};

        Arrays.sort(value);
        for(int i = 1; i<value.length; i++){
            if (i != value[i-1]){
                System.out.println("Missing Integer : " + i);
                return;
            }
        }
    }
}
