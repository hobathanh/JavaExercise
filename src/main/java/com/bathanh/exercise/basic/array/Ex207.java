package com.bathanh.exercise.basic.array;

public class Ex207 {

    public String sortArrayAsc(final int[] array, final int a) {
        StringBuilder resultArray = new StringBuilder();
        int[] newArray = new int[array.length + 1];
        int j = 0;
        int i = 0;
//        for (i = 0; i < newArray.length; i++) {
//            if (newArray.length - i == 1) {
//                newArray[i] = a;
//                break;
//            }
//            if (a <= array[i]) {
//                newArray[i] = a;
//                break;
//            } else {
//                newArray[i] = array[j++];
//            }
//        }
        int pos = 0;
        while (pos <= newArray.length - 1) {
            if ((newArray.length - pos == 1) || a <= array[pos]) {
                newArray[pos] = a;
                break;
            }
            newArray[pos] = array[i++];
            pos++;
        }

        for (int k = pos + 1; k < newArray.length; k++) {
            newArray[k] = array[i++];
        }
        for (i = 0; i < newArray.length; i++) {
            resultArray.append(newArray[i] + ", ");
        }

//        for (int k = i + 1; k < newArray.length; k++) {
//            newArray[k] = array[j++];
//        }
//        for (i = 0; i < newArray.length; i++) {
//            resultArray.append(newArray[i] + ", ");
//        }
        return resultArray.substring(0, resultArray.length() - 2);
    }
}
