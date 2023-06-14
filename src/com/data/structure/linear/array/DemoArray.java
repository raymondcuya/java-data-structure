package com.data.structure.linear.array;

import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbersArrayInit = {10, 20, 30};
        System.out.println(Arrays.toString(numbersArrayInit));
    }
}
