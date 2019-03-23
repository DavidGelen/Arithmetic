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
        sort(arr);
    }

    private static void insertSort(int[] arr) {
        int i,j;
        for(i = 1; i < arr.length; i++){
            int temp = arr[i];
            for(j = i - 1; j >= 0 && arr[j]> temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        traverse(arr);
    }

    public static void sort(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > currentNumber) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentNumber;
        }
        traverse(numbers);
    }

    private static void traverse(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
