package org.example;

import java.util.Scanner;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String s1 = a.substring(0, a.indexOf("(") + 1);
        String s2 = a.substring(a.indexOf(")"));

        System.out.println((s1.length() == s2.length()) ? "correct" : "fix");
    }
}
