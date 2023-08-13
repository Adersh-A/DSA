package org.macro.sortAlgorithms;

import java.util.Arrays;

/*
 complexity
 time - O(n^2)
 space - in place algorithm O(1)
 its a unstable sort algorithm
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,9,-2,44,32,-3,52,5};

        doSelectionSort(arr);
    }

    /*
        find the maximum element from the array and
        swap the value to last of the array
     */
    private static void doSelectionSort(int[] arr) {
        for(int i= arr.length-1; i>0; i--){
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
