package com.wwe.sort;

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

    /**
     * @name Arithmetic
     * @class name：com.wwe.insert_sort
     * @anthor David
     * @time 2019/3/22 22:31
     * @class describe
     */
    public static class InsertSort {
        public static void main(String[] args) {
            int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            sort(arr);
            traverse(arr);
        }

        private static void sort(int[] arr) {

            //为什么i不是0，因为0前面没数啦
            for(int i = 1; i < arr.length; i++) {
                //j是从右往左排，所以是一个做减法的操作
                for(int j = i; j > 0; j--) {
                    if(arr[j] < arr[j - 1]) {
                        swap(arr, j);
                    }
                }
            }
        }

        private static void swap(int[] arr, int j) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }

        private static void traverse(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * @name Arithmetic
     * @class name：com.wwe.select_sort
     * @anthor David
     * @time 2019/3/23 12:58
     * @class describe
     */
    public static class SelectSort {
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

        public static void selectSortPositive(int[] arr) {
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
}
