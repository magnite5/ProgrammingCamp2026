package org.example;

import java.util.Scanner;

public class superyatzy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] dice = new int[N];
        int[] counts = new int[6];

        for (int i = 0; i < N; i++) {
            dice[i] = input.nextInt();
            counts[dice[i] - 1]++;
        }

        int mostCommon = 0;
        for (int i = 0; i < 6; i++) if (counts[i] > mostCommon) mostCommon = i;

        if ((counts[mostCommon] + M) >= N) System.out.println("Ja");
        else System.out.println("Nej");
    }
}
