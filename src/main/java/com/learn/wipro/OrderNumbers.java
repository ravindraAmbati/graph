package com.learn.wipro;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrderNumbers {

    public static void main(String[] args) {

        String numbers = "20 20 20 48 45 4 36 58 52 45 48 53 36 0 5 9 5 4 3 5 6 2 4 3 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 27 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 37 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 47 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 57 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 67 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 7 76 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 7 7 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
                "44 55 8 665 98 6 699 88 7 7 7 7 77 77 777 97 7 7 75 4 5 45 45 45 54 54 8 5 " +
                "8 3 45 32 13 2 32 32 5 3 53 56 53 56 35 635 35 35 48 46 876 4 ";

        String[] numArrays = numbers.split(" ");
        approach1(numArrays);
    }

    private static void approach1(String[] numArrays) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for (String num : numArrays) {
            int i = Integer.parseInt(num);
            Integer temp = numMap.get(i);
            int count = null != temp ? temp : 0;
            numMap.put(i, ++count);
        }
        System.out.println(numMap);
        numMap.values().stream().sorted(Comparator.reverseOrder()).forEach(
                n -> {
                    Iterator<Integer> itr = numMap.keySet().iterator();
                    while (itr.hasNext()) {
                        int key = itr.next();
                        int value = numMap.get(key);
                        if (value == n) {
                            for (int i = 0; i < n; i++) {
                                System.out.print(key+" ");
                            }
                            itr.remove();
                        }
                    }
                }
        );
    }
}
