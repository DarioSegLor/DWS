package com.example.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class T15Ej1 {
    
    public static void main(String[] args) {

        List<Integer> numberList = List.of(1, 2,3,4,5,6,7,8,9,10);
        List<Integer> numberPares = numberList
                                    .stream()
                                    .filter(nums -> nums %2 == 0)
                                    .collect(Collectors.toList());
        System.out.println(numberPares);

    }
} 
