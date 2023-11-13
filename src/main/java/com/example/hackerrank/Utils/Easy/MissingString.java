package com.example.hackerrank.Utils.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingString {
    public static void main(String[] args) {
        String[] alfabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        String[] value = {"e","d","f","b","a"};
        Arrays.sort(value);

        List<String> valueUpperCase = new ArrayList<>();
        for (int j = 0; j<value.length; j++){
            String toUpperCase = value[j].toUpperCase();
            valueUpperCase.add(toUpperCase);
        }

        for(int i = 0; i<valueUpperCase.size(); i++){
            if (!valueUpperCase.get(i).equals(alfabet[i])){
                System.out.println("Missing String : " + alfabet[i]);
                return;
            }
        }
        System.out.println("True");
    }
}
