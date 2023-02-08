package com.bathanh.exercise.basic.array;

public class Ex209 {

    public int countPrimesArray(final int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkPrime(array[i])) {
                count += 1;
            }
        }
        return count;
    }

    public boolean checkPrime(final int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
