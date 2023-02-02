package com.bathanh.exercise.basic.number;

import java.util.List;

public class Exercise03 {

    public String analysisOutPrimeNumbers (final int a){
        int n = a;
        String arr = "";
        if(n < 2){
            System.out.println("Input khong hop le");
        }
        else {
            for(int i = 2; i < n; i++){
                while (n % i == 0){
                    n = n / i;
//                    arr.add(i);
                    System.out.print(i + " * ");
                }
                if (n == 1){
                    break;
                }
            }
        }
        return arr;
    }
}
