package com.bathanh.exercise.basic.number;

public class Exercise08 {

    public int reverseBits(final int n) {
        int inputN = n;
        int reverseN = 0;
        while (inputN > 0) {
            reverseN <<= 1;
            if ((int) (n & 1) == 1)
                reverseN ^= 1;

            // bitwise right shift
            //'n' by
            inputN >>= 1;
        }
        // required number
        return 0;
    }
}
