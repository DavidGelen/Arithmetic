package com.wwe.select_sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.select_sort
 * @anthor David
 * @time 2019/3/23 12:58
 * @class describe
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,1,7,9,4,2};
        // selectSortPositive(arr);
        //selectSortReversed(arr);
        //getMinValue(arr);
        getMaxValueFromArray(arr);
    }

    private static int getMaxValueFromArray(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length -1; i++) {
            max = arr[i] > arr[max] ? i : max;
        }
        System.out.println("max = " + arr[max]);
        return arr[max];
    }

    private static int getMinValue(int[] arr) {
        int minPos = 0;
        for(int i = 0; i < arr.length -1; i++) {
            minPos = arr[i] > arr[minPos] ? minPos : i;
        }
        System.out.println("min = " + arr[minPos]);
        return arr[minPos];
    }

    private static void selectSortReversed(int[] arr) {
        for(int i = 0; i < arr.length -1; i++) {
            int maxPositon = i;
            for(int j = i+1; j < arr.length; j++) {
                maxPositon = arr[j] > arr[maxPositon] ? j : maxPositon;
            }
            swapValue(arr,i,maxPositon);
        }
        traverse(arr);
    }

    private static void selectSortPositive(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
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
