package com.polovyi.ivan.tutorials;

import java.util.Arrays;

public class ArraysMismatchExamples {

    public static void main(String[] args) {
        int mismatch1 = Arrays.mismatch(new int[]{1, 2, 3},
                                        new int[]{1, 2, 3});
        // -1 - arrays are equal
        System.out.println("mismatch1 = " + mismatch1);

        int mismatch2 = Arrays.mismatch(new String[]{"apple", "banana"},
                                        new String[]{"apple", "banana"});
        // -1 - arrays are equal
        System.out.println("mismatch2 = " + mismatch2);

        int mismatch3 = Arrays.mismatch(new int[]{1, 2, 3},
                                        new int[]{1, 2, 4});
        // 2 - arrays are different at index 2
        System.out.println("mismatch3 = " + mismatch3);

        int mismatch4 = Arrays.mismatch(new String[]{"apple", "banana", "cherry"},
                                        new String[]{"apple", "pear", "cherry" });
        // 1 - arrays are different at index 2
        System.out.println("mismatch4 = " + mismatch4);

        int mismatch6 = Arrays.mismatch(new int[]{1, 2, 3},
                                        new int[]{4, 5, 6});
        // 0 - completely different
        System.out.println("mismatch6 = " + mismatch6);


        int mismatch7 = Arrays.mismatch(new String[]{"apple", "banana"},
                                        new String[]{"pear", "cherry" });
        // 0 - completely different
        System.out.println("mismatch7 = " + mismatch7);


        int mismatch8 = Arrays.mismatch(new int[]{1, 2, 3},
                                        new int[]{1, 2, 3, 4, 5, 6});
        // 3 - prefix length is 3
        System.out.println("mismatch8 = " + mismatch8);


        int mismatch9 = Arrays.mismatch(new String[]{"apple", "banana", "pear", "cherry"},
                                        new String[]{"apple", "banana" });
        // 2 - prefix length is 2
        System.out.println("mismatch9 = " + mismatch9);

    }
}
