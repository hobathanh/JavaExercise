package com.bathanh.exercise.basic.array;

public class Ex207 {

    public String sortArrayAsc(final int[] array, final int a) {
        StringBuilder resultArray = new StringBuilder();
        int[] newArray = new int[array.length + 1];
        int index = indexArray(array, a);
        int j = 0;
        for (int i = 0; i <= newArray.length - 1; i++) {
            if (i == index) {
                newArray[index] = a;
            } else {
                newArray[i] = array[j++];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            resultArray.append(newArray[i] + ", ");
        }
        return resultArray.substring(0, resultArray.length() - 2);
    }

    public int indexArray(int[] array, int a) {
        int index = 0;
        int lengthArray = array.length;
        if (lengthArray == 0) {
            return 0;
        }
        if (array[array.length - 1] < a) {
            return array.length;
        }
        for (int i = 1; i <= array.length - 1; i++) {
            if (a <= array[i] && a >= array[i - 1]) {
                index = i;
            }
        }
        return index;
    }
}
