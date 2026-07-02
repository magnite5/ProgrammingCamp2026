package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class takinginventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> contents = new HashMap<>();

        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            String name = input.next();
            int amount = input.nextInt();
            if (contents.containsKey(name)) {
                contents.put(name, contents.get(name) + amount);
            } else {
                contents.put(name, amount);
            }
        }
        contents.forEach((name, amount) -> {
            System.out.println(name + " " +  (int)Math.ceil((double) amount / 64));
        });
    }
}
