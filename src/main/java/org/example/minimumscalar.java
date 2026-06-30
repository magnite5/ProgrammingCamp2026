package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class minimumscalar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCount = input.nextInt();
        for (int i = 0; i < testCount; i++) {
            System.out.printf("Case #%d: %d%n", i + 1, evaluateCase(input));
        }
    }

    public static int evaluateCase(Scanner input) {
        int n = input.nextInt();
        Integer[][] lines = new Integer[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                lines[i][j] = input.nextInt();
            }
        }
        // sort list 1 ascending, list 2 descending for minimum
        Integer[] x = Arrays.copyOf(lines[0], lines[0].length);
        Integer[] y = Arrays.copyOf(lines[1], lines[1].length);

        Arrays.sort(lines[0]);
        Arrays.sort(lines[1], Collections.reverseOrder());

        return scalarProduct(lines[0], lines[1]);
    }

    public static int scalarProduct(Integer[] x, Integer[] y) {
        int product = 0;
        for (int i = 0; i < x.length; i++) product += (x[i] * y[i]);
        return product;
    }
}
