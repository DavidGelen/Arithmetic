package com.wwe.sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.sort
 * @class describe
 * @anthor David
 * @time 2019/4/7 3:28 PM
 * @class 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr);
        traverse(arr);
    }

    private static void sort(int[] arr) {
        //为什么i不是0，因为0前面没数啦
        for(int i = 1; i < arr.length; i++) {
            //j是从右往左排，所以是一个做减法的操作,j != 0
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    swapValue(arr, j,j-1);
                }
            }
        }
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
