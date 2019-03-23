package com.wwe.insert_sort;

/**
 * @name Arithmetic
 * @class name：com.wwe.insert_sort
 * @anthor David
 * @time 2019/3/22 22:31
 * @class describe
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int i,j;
        for(i = 1; i< arr.length; i++){
            int temp = arr[i];
            for(j = i - 1; j >= 0 && arr[j]> temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        traverse(arr);
    }

    private static void traverse(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
