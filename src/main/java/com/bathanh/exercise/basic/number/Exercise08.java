package com.bathanh.exercise.basic.number;

public class Exercise08 {
    
    public int reverseBits(final int n) {
        int inputN = n;
        int reverseN = 0;
        while (inputN > 0) {
            reverseN <<= 1;
            if ((inputN & 1) == 1) {
                reverseN ^= 1;
            }
            inputN >>= 1;
        }
        return reverseN;
    }
}
