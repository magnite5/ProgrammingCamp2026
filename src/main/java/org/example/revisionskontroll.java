package org.example;

import java.util.*;

public class revisionskontroll {
    public static void main(String[] args) {
        Set<Integer> receipts = new HashSet<>();
        List<Integer> results = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            int receipt = input.nextInt();
            int former = receipts.size();

            receipts.add(receipt);

            results.add(receipts.size() == former ? 0 : 1);
        }

        StringBuilder sb = new StringBuilder();
        results.forEach(i -> {
            sb.append(i).append(" ");
        });
        System.out.println(sb);
    }
}