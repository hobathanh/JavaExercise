package com.bathanh.exercise.basic.array;

public class Ex209 {

    public int sumPrimesArray(final int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkPrime(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public boolean checkPrime(final int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
