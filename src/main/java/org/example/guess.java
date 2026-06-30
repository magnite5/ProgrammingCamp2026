package org.example;

import java.util.Scanner;

public class guess {
    public static int count;
    public static void main(String[] args) {
        count = 0;
        makeGuess(1000, 1, new Scanner(System.in));
    }

    public static int makeGuess(int max, int min, Scanner input) {
        if (max == min) {
            System.out.println(max);
            return max;
        }
        int mid = (max + min) / 2;

        System.out.println((max + min) / 2);
        System.out.flush();
        count++;
        String result = input.nextLine().trim();

        return switch (result) {
            case "correct" -> (max + min) / 2;
            case "lower" -> makeGuess(mid - 1, min, input);
            case "higher" -> makeGuess(max, mid + 1, input);
            default -> -1;
        };
    }
}
