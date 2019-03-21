package com.wwe.selection_sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.selection_sort
 * @anthor David
 * @time 2019/3/21 21:28
 * @class describe
 */
public class Sort1 {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,1,7,9,4,2};
        int max = getMaxValueFromArray(arr);
        System.out.println("max = " + max);
    }

    private static int getMaxValueFromArray(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length -1; i++) {
            max = arr[i] > arr[max] ? i : max;
        }
        return max;
    }

    private static void selectSortReversed(int[] arr) {
        for(int i = 0; i < arr.length -1; i++) {
            int maxPositon = i;
            for(int j = i+1; j < arr.length; j++) {
                maxPositon = arr[j] > arr[maxPositon] ? j : maxPositon;
            }
            int temp = arr[i];
            arr[i] = arr[maxPositon];
            arr[maxPositon] = temp;
        }
        traverse(arr);
    }

    private static void selectSortPositive(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                }
            }
            swapValue(arr,i,minIndex);
        }
        traverse(arr);
    }

    private static void swapValue(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void traverse(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
