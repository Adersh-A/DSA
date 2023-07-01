package org.macro.SortAlgorithms;

import java.util.Arrays;

/*
 complexity
 time - O(n^2)
 space - in place algorithm O(1)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,6,3,2,8,4};
        int[] sortedArr = doBubbleSort(arr);
        Arrays.stream(sortedArr).forEach(System.out::print);
    }

    private static int[] doBubbleSort(int[] arr) {
        /*
        loop through the array and swap elements by comparing.
        first iteration the largest element will be at the last
        second iteration the second largest will be at second last
        and so on ...
         */
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
