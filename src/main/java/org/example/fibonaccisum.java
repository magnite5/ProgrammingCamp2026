package org.example;

import java.util.*;

public class fibonaccisum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int target = input.nextInt();
        List<Integer> fibs = new ArrayList<>();

        for (int i = 1; i <= target; i++) {
            int fib = fib(i);
            if (fib > target) break;
            if (fib == target) {
                System.out.println("Found: " + fib); //TODO
//                return;
            }
            if (!fibs.contains(fib) || fib == 1) fibs.add(fib);
        }
        getShortestSum(target, fibs).forEach((n) -> {
            System.out.print(n + " ");
        });
    }

    public static int fib(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int prev = 0;
        int current = 1;

        for (int i = 0; i < (n-2); i++) {
            int temp = prev + current;
            prev = current;
            current = temp;
        }

        return current;
    }

    public static List<Integer> getShortestSum(int target, List<Integer> numbers) {
        ArrayList<Integer> results = new ArrayList<>();
        int sum = 0;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int n = numbers.get(i);
            if (sum + n > target) {
                break;
            } else {
                results.add(n);
            }
            if (sum == target) return results;
        }
        return new ArrayList<>();
    }
}
