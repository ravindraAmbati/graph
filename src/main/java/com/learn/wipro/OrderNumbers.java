package com.learn.wipro;


import java.util.*;
import java.util.stream.Collectors;

public class OrderNumbers {

    private static final Comparator<Map.Entry<?, Integer>> entryComparator = (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue());
    public static void main(String[] args) {

//        String numbers = "20 20 20 48 45 4 36 58 52 45 48 53 36 0 5 9 5 4 3 5 6 2 4 3 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 27 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 37 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 47 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 57 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 67 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 7 76 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 7 7 7 7 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "2 1 7 8 9 4 5 6 1 23 4 5 22 3 6 5 6 8 6 5 6 5 6 9 8 7 45 6 55 43 3 6 " +
//                "44 55 8 665 98 6 699 88 7 7 7 7 77 77 777 97 7 7 75 4 5 45 45 45 54 54 8 5 " +
//                "8 3 45 32 13 2 32 32 5 3 53 56 53 56 35 635 35 35 48 46 876 4 ";
        String numbers = "8 8 9 6 5 4 4 4 5 5 7 6 6 9 7 8 8 7";

        String[] numArrays = numbers.split(" ");
        getTopRecords(numArrays, 1);
        getTopRecords(numArrays, 2);
        getTopRecords(numArrays, 3);

        String names = "ravindra reddy ambati java java string null null null string ravindra ravindra";

        String[] nameArray = names.split(" ");
        getTopRecords(nameArray, 1);
        getTopRecords(nameArray, 2);
        getTopRecords(nameArray, 3);
    }

    private static void getTopRecords(String[] numArrays, int limit) {
        try{
            Integer.parseInt(numArrays[0]);
            getTopRecordsNumbers(numArrays, limit);
        } catch (NumberFormatException e){
            getTopRecordsString(numArrays, limit);
        }
    }

    private static void getTopRecordsString(String[] numArrays, int limit) {

        Map<String, Integer> numMap = new HashMap<>();

        for (String str : numArrays) {
            Integer temp = numMap.get(str);
            int count = null != temp ? temp : 0;
            numMap.put(str, ++count);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(numMap.entrySet());
        list.sort(entryComparator);
        System.out.println(list.stream().limit(limit).collect(Collectors.toList()));
    }

    private static void getTopRecordsNumbers(String[] numArrays, int limit) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (String num : numArrays) {
            int i = Integer.parseInt(num);
            Integer temp = numMap.get(i);
            int count = null != temp ? temp : 0;
            numMap.put(i, ++count);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numMap.entrySet());
        list.sort(entryComparator);
        System.out.println(list.stream().limit(limit).collect(Collectors.toList()));
    }
}
