package com.wwe.bubble_sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.bubble_sort
 * @anthor David
 * @time 2019/3/22 21:45
 * @class describe
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        for(int i = 0; i < arr.length -1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
               if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        traverse(arr);
    }

    private static void traverse(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
