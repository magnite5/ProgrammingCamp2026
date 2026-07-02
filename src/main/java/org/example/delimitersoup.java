package org.example;

import java.util.*;

public class delimitersoup {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner input = new Scanner(System.in);

        input.nextLine();
        String s = input.nextLine();

        int i = 0;
        for (; i < s.length(); i++) {
            char newChar = s.charAt(i);
            if (newChar == '[' || newChar == '{' || newChar == '(') {
                stack.push(newChar);
                continue;
            }
            if (stack.isEmpty() && newChar != ' ') {
                stack.push(newChar);
                break;
            }

            if (newChar == ']') {
                if (stack.peek() != '[') {
                    stack.push(newChar);
                    break;
                }
                else stack.pop();
            }
            if (newChar == '}') {
                if (stack.peek() != '{') {
                    stack.push(newChar);
                    break;
                }
                else stack.pop();
            }
            if (newChar == ')') {
                if (stack.peek() != '(') {
                    stack.push(newChar);
                    break;
                }
                else stack.pop();
            }
        }

        if (i == s.length()) {
            System.out.println("ok so far");
        } else {
            System.out.println(stack.peek() + " " + i);
        }
    }
}
