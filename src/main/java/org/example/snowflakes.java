package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class snowflakes {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(input.readLine());

        int[] maxSizes = new int[testCount];

        for (int i = 0; i < testCount; i++) {
            int snowflakeCount = Integer.parseInt(input.readLine());
            int size = 0;

            Stack<Integer> stack = new Stack<>();

            for (int j = 0; j < snowflakeCount; j++) {
                int snowflake = Integer.parseInt(input.readLine());
                if ((!stack.isEmpty()) && (stack.contains(snowflake))) {
                    if (maxSizes[i] < size) maxSizes[i] = size;
                    size = 0;
                    stack.clear();
                }
                size++;
                stack.push(snowflake);
            }
        }

        for (int s : maxSizes) {
            System.out.println(s);
        }
    }
}
