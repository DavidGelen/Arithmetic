package com.wwe.sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.sort
 * @class describe
 * @anthor David
 * @time 2019/5/4 11:47 PM
 * @class 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7,3,2,8,1,6,5,4,9};
        sort(arr,0,arr.length - 1);
        traverse(arr);
    }

    public static void sort(int[] arr,int leftBound,int rightBound) {
        if(leftBound >= rightBound) {
            return;
        }
        int mid = partition(arr,leftBound,rightBound);
        sort(arr,leftBound,mid-1);
        sort(arr,mid+1,rightBound);
    }

    /**
     * @Author: David
     * @Date: 2019/5/5 10:23 PM
     * @param arr
     * @param leftBound
     * @param rightBound
     * @Description: 分区
     */
    public static int partition(int[] arr,int leftBound,int rightBound) {
        int pivot = arr[rightBound];//轴先定义出来
        int left = leftBound;
        int right = rightBound - 1;
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--;
            if(left < right) {
                swapValue(arr,left,right);
            }
        }
        swapValue(arr,left,rightBound);
        return left;
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
