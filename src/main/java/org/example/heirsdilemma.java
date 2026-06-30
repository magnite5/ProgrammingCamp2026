package org.example;

import java.util.Scanner;

public class heirsdilemma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ints = new int[6];
        for (int i = 0; i < 6; i++) {

        }
    }

    public static boolean isValid(int[] ints, int max, int min) {
        int result = 1;
        for (int i : ints) result *= i;

        if (result <= max && result >= min) {
        }
        return true;
    }
}
