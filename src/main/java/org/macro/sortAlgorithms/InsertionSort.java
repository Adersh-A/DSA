package org.macro.sortAlgorithms;

import java.util.Arrays;

/*
 complexity
 time - O(n^2)
 space - in place algorithm O(1)
 its a stable sort algorithm
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,35,11,2,-3,-11};
        doInsertionSort(arr);
    }
    // loop through the end of the array and compare it with sorted array. initially we assume arr[0] will be sorted,
    // and then we expand that array
    private static void doInsertionSort(int[] arr) {

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j;
            for(j=i; j>0 && arr[j-1]>temp; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

}
