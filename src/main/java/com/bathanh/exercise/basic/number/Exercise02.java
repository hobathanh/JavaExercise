package com.bathanh.exercise.basic.number;

public class Exercise02 {

    public int calculateSumOfDigits(final int a) {
        int input = a;
        int sum = 0;
        while (input != 0){
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }
}
