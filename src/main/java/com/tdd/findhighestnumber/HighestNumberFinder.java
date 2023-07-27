package com.tdd.findhighestnumber;

public class HighestNumberFinder {
    public int findHighestNumber(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
