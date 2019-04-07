package com.wwe;

import com.wwe.sort.BubbleSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @name Arithmetic
 * @class name：com.wwe
 * @class describe
 * @anthor David
 * @time 2019/4/5 2:31 PM
 * @class describe
 */
public class DataCheck {

    public static void main(String[] args) {
        check();
    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[10000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    private static void check() {
        int[] randomArr = generateRandomArray();
        int[] copyArr = new int[randomArr.length];
        System.arraycopy(randomArr, 0, copyArr, 0, randomArr.length);

        Arrays.sort(randomArr);
        BubbleSort.SelectSort.selectSortPositive(copyArr);

        System.out.println("check -> " + compareArray(randomArr,copyArr));
    }

    private static boolean compareArray(int[] a,int[] b) {
        for(int i = 0; i < b.length; i++) {
            if(a[i] != b[i])
                return false;
        }
        return false;
    }
}
