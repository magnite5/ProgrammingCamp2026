package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class backspace {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String line = input.readLine();

        Stack<Character> result = new Stack<>();

        char prev = ' ';

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '<') result.pop();
            else result.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : result) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
