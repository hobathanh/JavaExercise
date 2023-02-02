package com.bathanh.exercise.basic.number;

public class Exercise02 {

    public int calculateSumOfDigits(final int a){
        int Input = a;
        int sum = 0, count = 0;
        while (Input != 0){
            count = Input % 10;
            sum += count;
            Input = Input / 10;
        }
        return sum;
    }
}
