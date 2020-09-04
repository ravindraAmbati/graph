package com.learn.dbs;

import java.util.Stack;

public class Balance {

    private static final String BALANCED = " BALANCED";
    private static final String UNBALANCED = " UNBALANCED";

    public static void main(String[] args) {

        String expression = "{[()]}{[({[()]})]}";
        System.out.println(check(expression));
        expression = "{";
        System.out.println(check(expression));
        expression = "{{";
        System.out.println(check(expression));
        expression = "{}{";
        System.out.println(check(expression));
        expression = "{[(]}{)";
        System.out.println(check(expression));
        expression = "";
        System.out.println(check(expression));
        expression = "aba";
        System.out.println(check(expression));
        check(null);
    }

    private static String check(String expression) {
        if (expression == null || expression.isBlank() || expression.isEmpty() || isOddNumber(expression.length())) {
            return expression + UNBALANCED;
        }
        char[] chars = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (isOpenTag(c)) {
                stack.push(c);
            } else {
                if (!Character.valueOf(getCloseTag(c)).equals(stack.pop())) {
                    throw new IllegalArgumentException(UNBALANCED + c);
                }
            }
        }
        return expression + (stack.isEmpty() ? BALANCED : UNBALANCED);
    }

    private static boolean isOddNumber(int length) {
        return (length & 1) != 0;
    }

    private static char getCloseTag(char c) {
        switch (c) {
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                throw new IllegalArgumentException(UNBALANCED + c);
        }
    }

    private static boolean isOpenTag(char c) {
        return c == '{' || c == '[' || c == '(';
    }
}
