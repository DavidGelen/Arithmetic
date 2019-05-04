package com.wwe.sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.sort
 * @class describe
 * @anthor David
 * @time 2019/5/3 10:48 AM
 * @class 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0,arr.length - 1);
        traverse(arr);
    }

    public static void sort(int[] arr,int start,int end) {
        if(start == end) {
            return;
        }

        //分成2半，左边排序，右边排序
        int mid = start + (end - start)/2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr,start,mid+1,end);
    }

    public static void merge(int[] arr,int leftStart,int rightStart,int end) {
        int mid = rightStart - 1;
        int[] temp = new int[end - leftStart + 1];

        int i = leftStart;
        int j = rightStart;
        int k = 0;

        while(i <= mid && j <= end) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        //左半边数组和右半边数组长度不一样，一定会有比剩下，下面2个while是拼接操作
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= end) {
            temp[k++] = arr[j++];
        }

       //temp排好序之后将值复制到arr上
        for(int m = 0; m < temp.length; m++) {
            arr[leftStart + m] = temp[m];
        }
    }

    private static void traverse(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
