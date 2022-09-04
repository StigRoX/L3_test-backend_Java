package com.geekbrains.resolver;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Resolver {

    /**
     *
     * @param array may be null or empty
     * @return
     */
    public int getMin(int[] array){
//        return IntStream.of(array).min().getAsInt();

        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

//        IntStream.of(array).min().orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));

        int min = array[0]; // int min is compared with array[0] can be used instead of Integer.MAX_VALUE
        for (int i : array){
            if (i < min){
                min = i;
            }
//            if(min > 1000){
//                min = 1;
//            } // test will fail
        }
        return min;
    }

//    public int[] sort(int[] array){
//
//        int n = array.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (array[j] > array[j+1]) {
//                    int cur = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = array[cur];
//                }
//            }
//        }
//        return array;
//    }

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
