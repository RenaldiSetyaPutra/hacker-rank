package com.example.hackerrank.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input Target Sum");
        int targetSum = s.nextInt();
        System.out.println("Input K");
        int k = s.nextInt();

        int[] candidates = {1, 2, 3};

        List<List<Integer>> combinations = findCombinations(targetSum, candidates);
        int count = 0;
        for (List<Integer> combination : combinations) {
//            System.out.println(count + ". " + combination);
            count++;
        }
        System.out.println(count);
    }

    public static List<List<Integer>> findCombinations(int targetSum, int[] candidates) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationsHelper(targetSum, candidates, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinationsHelper(int targetSum, int[] candidates, int index, List<Integer> path, List<List<Integer>> result) {
        if (targetSum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (targetSum < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            findCombinationsHelper(targetSum - candidates[i], candidates, i, path, result);
            path.remove(path.size() - 1);
        }
    }
}
