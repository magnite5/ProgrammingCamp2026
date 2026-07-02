package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class haypoints {
    public static void main(String[] args) {
        HashMap<String, Integer> values = new HashMap<>();
        Scanner input = new Scanner(System.in);

        int hayCount = input.nextInt();
        int descriptionCount = input.nextInt();

        int[] descriptions = new int[descriptionCount];

        for (int i = 0; i < hayCount; i++) {
            values.put(input.next(), input.nextInt());
        }

        for (int i = 0; i < descriptionCount; i++) {
            while (true) {
                String s = input.next().trim();
                if (s.equals(".")) break;
                if (values.containsKey(s)) descriptions[i] += values.get(s);
            }
        }

        for (int c : descriptions) {
            System.out.println(c);
        }
    }
}
