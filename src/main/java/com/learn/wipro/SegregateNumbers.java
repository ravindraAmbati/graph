package com.learn.wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegregateNumbers {

    public static void main(String[] args) {

        String numbers = "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 " +
                "3 4 5 6 7 8 9 0 1 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 " +
                "9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8" +
                "3 4 5 6 7 8 9 0 1 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 " +
                "9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "3 4 5 6 7 8 9 0 1 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7" +
                " 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "3 4 5 6 7 8 9 0 1 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9" +
                " 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 " +
                "0" +
                "2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 " +
                "0" +
                " 9 0 " +
                "3 4 5 6 7 8 9 0 1 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7" +
                " 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "3 4 5 6 7 8 9 0 1 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9" +
                " 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 " +
                "0" +
                "2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 " +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 " +
                "0" +
                "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 ";
        String[] numArray = numbers.split(" ");
        approach1(numArray);
        approach2(numArray);
        approach3(numArray);
    }

    public static void approach1(String[] numArray) {

        long start = System.currentTimeMillis();

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (String num : numArray) {
            int i = Integer.parseInt(num);
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        print(evenNumbers);
        print(oddNumbers);
        System.out.println();
        System.out.println("Time(ms) taken: "+(System.currentTimeMillis()-start));
    }

    public static void approach2(String[] numArray) {

        long start = System.currentTimeMillis();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (String num : numArray) {
            int i = Integer.parseInt(num);
            if ((i & 1) == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        print(evenNumbers);
        print(oddNumbers);
        System.out.println();
        System.out.println("Time(ms) taken: "+(System.currentTimeMillis()-start));
    }

    private static void approach3(String[] numArray) {

        long start = System.currentTimeMillis();
        Arrays.sort(numArray);
        print(0, numArray);
        print(1, numArray);
        System.out.println();
        System.out.println("Time(ms) taken: "+(System.currentTimeMillis()-start));
    }

    private static void print(int init, String[] numArray) {

        for (int i = init; i < numArray.length; i = i + 2) {
            System.out.print(numArray[i] + " ");
        }
    }

    private static void print(List<Integer> numbers) {

        numbers.stream().sorted().forEach(i -> System.out.print(i + " "));
    }
}
