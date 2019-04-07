package com.wwe.sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.sort
 * @class describe
 * @anthor David
 * @time 2019/4/7 3:22 PM
 * @class 希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};

        //5,10，1，第一次gap=4，取出间隔数
        shellSort(arr);

        //写完之后用datacheck对一下,验证算法的正确性
        traverse(arr);
    }

    public static void shellSort(int[] arr) {
        for(int gap = 4; gap > 0; gap /= 2) {
            for(int i = gap; i < arr.length; i++) {
                for(int j = i; j > gap - 1; j -= gap) {
                    if(arr[j] < arr[j - gap]) {
                        swap(arr, j,j-gap);
                    }
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
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
