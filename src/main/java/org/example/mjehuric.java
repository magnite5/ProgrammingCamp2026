package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class mjehuric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            inputs.add(scanner.nextInt());
        }

        sort(inputs, 0);
    }

    public static void sort(ArrayList<Integer> list, int start) {
        int current = list.get(start);
        int next = list.get(start+1);
        if (current > next) {
            list.set(start, next);
            list.set(start + 1, current);
        }

        list.forEach(integer -> {
            System.out.print(integer + " ");
        });

        boolean sorted = isSorted(list);
        System.out.println(sorted ? "Sorted" : "Unsorted");
        if (sorted) sort(list, start+1);
    }

    public static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) >= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
