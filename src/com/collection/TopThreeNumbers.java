package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopThreeNumbers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10,45,23,89,67,12,90,56,89);

        List<Integer> top3 = number.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println("Top 3 highest number: "+top3);

    }
}
