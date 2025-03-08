package com.polovyi.ivan.tutorials;

import java.util.Arrays;

public class ArraysCompareExamples {


    public static void main(String[] args) {
        int compare1 = Arrays.compare(new int[]{1, 2, 3},
                                      new int[]{1, 2, 3});
        // 0 - arrays are equal
        System.out.println("compare1 = " + compare1);

        int compare2 = Arrays.compare(new String[]{"apple", "banana"},
                                      new String[]{"apple", "banana"});
        // 0 - arrays are equal
        System.out.println("compare2 = " + compare2);


        int compare3 = Arrays.compare(new int[]{1, 2, 3},
                                      new int[]{1, 2, 4});
        // -1 - arrays are equal
        System.out.println("compare3 = " + compare3);

        int compare4 = Arrays.compare(new String[]{"apple", "banana"},
                                      new String[]{"apple", "cherry"});
        // -1 - arrays are equal
        System.out.println("compare4 = " + compare4);


        int compare5 = Arrays.compare(new int[]{1, 2, 4},
                                      new int[]{1, 2, 3});
        // 1 - arrays are equal
        System.out.println("compare5 = " + compare5);

        int compare6 = Arrays.compare(new String[]{"apple", "cherry"},
                                      new String[]{"apple", "banana"});
        // 1 - arrays are equal
        System.out.println("compare6 = " + compare6);


        int compare7 = Arrays.compare(new int[]{1, 2, 3},
                                      new int[]{1, 2, 3, 4});
        // -1 - arrays are equal
        System.out.println("compare7 = " + compare7);

        int compare8 = Arrays.compare(new String[]{"apple", "banana"},
                                      new String[]{"apple", "banana", "cherry"});
        // -1 - arrays are equal
        System.out.println("compare8 = " + compare8);

        int compare9 = Arrays.compare(new int[]{1, 2, 3, 4},
                                      new int[]{1, 2, 3});
        // 1 - arrays are equal
        System.out.println("compare9 = " + compare9);

        int compare10 = Arrays.compare(new String[]{"apple", "banana", "cherry"},
                                       new String[]{"apple", "banana"});
        // 1 - arrays are equal
        System.out.println("compare10 = " + compare10);


    }

}
