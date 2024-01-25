package com.fall23.random;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4}; // true
        int[] arr2 = {3, 2, 3, 4}; // true
        int[] arr3 = {3, 1, 2, 3}; // true
        int[] arr4 = {3, 4, 5};    // true
        int[] arr5 = {4, 3, 2, 1};  // false
        int[] arr6 = {2, 3, 4, 1};  // true

//        arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
//
//        arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
//
//        arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]

        System.out.println(operations("1", "2", "add"));
        System.out.println(operations("4", "5", "substract"));
        try {

            System.out.println(operations("6", "0", "divide"));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(operations("4", "5", "multiple"));


        String str1 = "Coordinate";

        System.out.println(testMethod(arr5));
        System.out.println(testMethod(arr2));
        System.out.println(testMethod(arr6));
        System.out.println(reverseText(str1));
        testMethod();
        System.out.println(Arrays.toString(arrayOfMultiples(17, 6)));
        System.out.println(Arrays.toString(arrayOfMultiples(12, 10)));

        int[] nums = {3, 1, 7, 4, 6, 2, 0};
        System.out.println(biggestNum(nums));


    }


    public static boolean testMethod(int... array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] < array[i + 1] && array[i + 1] < array[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static String reverseText(String str) {
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static int[] arrayOfMultiples(int num, int length) {
        int[] multiplesArray = new int[length];

        for (int i = 0; i < length; i++) {
            multiplesArray[i] = num * (i + 1);
        }
        return multiplesArray;
    }

    public static int operations(String a, String b, String operation) {

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int res = 0;

        if (operation.equalsIgnoreCase("add")) {
            res = a1 + b1;
        } else if (operation.equalsIgnoreCase("substract")) {
            res = a1 - b1;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (b1 == 0) {
                throw new ArithmeticException("Divide by zero nor allowed");
            }
            res = a1 / b1;

        } else if (operation.equalsIgnoreCase("multiple")) {
            res = a1 * b1;


        }
        return res;
    }

    int[] nums = {3, 1, 7, 4, 6, 2, 0};

    public static int biggestNum(int[] array) {
        int max = array[0]; // 0
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
