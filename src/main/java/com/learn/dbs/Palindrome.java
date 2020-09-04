package com.learn.dbs;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {

        String name;
        System.out.println(minimumCharsAdded(null));
        System.out.println(minimumCharsAdded(""));
        System.out.println(minimumCharsAdded("A"));
        name = "aa";
        System.out.println(minimumCharsAdded(name));
        name = "abc";
        System.out.println(minimumCharsAdded(name));
        name = "cbabc";
        System.out.println(minimumCharsAdded(name));
        name = "aacecaaaa";
        System.out.println(minimumCharsAdded(name));
        name = "12345";
        System.out.println(minimumCharsAdded(name));
    }

    private static String minimumCharsAdded(String name) {

        if (name == null || name.isBlank() || name.isEmpty())
            return "cannot be performed";

        int count = 0;
        String palindrome = name;
        StringBuilder charsToBeAdded = new StringBuilder();
        while (true) {
            if (isPalindrome(name)) {
                break;
            } else {
                count++;
                name = name.substring(0, name.length() - 1);
                charsToBeAdded.append(name.charAt(name.length() - 1));
            }
        }

        return palindrome + "    " + count + "  " + Arrays.toString(charsToBeAdded.toString().toCharArray());
    }

    private static boolean isPalindrome(String name) {

        char[] chars = name.toCharArray();
        for (int i = 0, j = name.length() - 1; i <= j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
