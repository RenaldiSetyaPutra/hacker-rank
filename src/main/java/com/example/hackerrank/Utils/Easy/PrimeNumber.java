package com.example.hackerrank.Utils.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger value = new BigInteger(n);
        if (value.isProbablePrime(100)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        bufferedReader.close();
    }

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        if (n > 100){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
