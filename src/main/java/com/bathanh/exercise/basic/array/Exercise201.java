package com.bathanh.exercise.basic.array;

public class Exercise201 {

    public int searchArrayLargest(int[] arrN) {
        int maxArrN = arrN[0];
        for (int i = 0; i <= arrN.length - 1; i++) {
            if (arrN[i] > maxArrN) {
                maxArrN = arrN[i];
            }
        }
        return maxArrN;
    }
}
