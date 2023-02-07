package com.bathanh.exercise.basic.array;

public class Ex207 {
    public String sortArrayAsc(final int[] array, final int a) {
        StringBuilder resultArray = new StringBuilder();
        int[] newArray = new int[array.length + 1];
        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (a <= array[i]) {
                newArray[i] = a;
                break;
            } else
                newArray[i] = array[j++];
        }
        for (int k = i + 1; k < newArray.length; k++) {
            newArray[k] = array[j++];
        }

        return resultArray.substring(0, resultArray.length() - 2);
    }
}
