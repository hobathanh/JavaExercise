package com.bathanh.exercise.basic.array;

public class Exercise203 {

    public String sortSumOfDigitAsc(int[] array) {
        StringBuilder resultString = new StringBuilder();
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sumOfDigits(array[i]) > sumOfDigits(array[j])) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            resultString.append(array[i] + ", ");
        }
        return resultString.substring(0, resultString.length() - 2);

    }

    public int sumOfDigits(final int n) {
        int inputN = n;
        int sum = 0;
        while (inputN > 0) {
            sum += inputN % 10;
            inputN = inputN / 10;
        }
        return sum;
    }
}
