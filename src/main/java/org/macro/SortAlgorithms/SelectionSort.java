package org.macro.SortAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,9,-2,44,32,-3,52,5};

        doSelectionSort(arr);
    }

    private static void doSelectionSort(int[] arr) {
        for(int i= arr.length-1; i>=0; i--){
            int max = 0;
            for(int j=1; j<= i; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            swapElements(arr, i, max);
        }
        Arrays.stream(arr)
                .forEach(element -> System.out.printf("%d ", element));
    }

    private static void swapElements(int[] arr, int i, int max) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }
}
