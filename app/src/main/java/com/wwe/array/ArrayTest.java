package com.wwe.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @name Arithmetic
 * @class name：com.wwe.array
 * @class describe
 * @anthor David
 * @time 2019/4/10 10:39 PM
 * @class describe
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,7};

        //删除第二个元素5
        //int deleteIndex = 2;
        int deleteValue = 5;
        int resultLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != deleteValue) {
                arr[resultLength] = arr[i];
                resultLength++;
            }
        }

        //1,3,8,7,7
        /*for(int i = deleteIndex; i <= arr.length - deleteIndex; i++) {
            arr[i] = arr[i+1];
        }*/

        /*for(int i = deleteIndex + 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }*/

        //得到的arry去重
        /*Set set = new LinkedHashSet<>(Arrays.asList(arr));
        trasverseArray(Arrays.to);*/
    }

    private static void insertValueToArray() {
        int[] arr = {1,3,8,7};
        //往arr里面第二个位置插入5,再仔细点可以加入边界处理
        int inserPosition = 2;
        int insertValue = 5;

        int[] newArray = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        //往newArray中插入5,这样插不对 => 1 3 5 8 8
        /*for(int i = inserPosition; i <= newArray.length - inserPosition; i++) {
            newArray[i+1] = newArray[i];
        }*/

        //插入要倒着插
        for (int i = newArray.length - 1; i > inserPosition; i--) {
             newArray[i] = newArray[i - 1];

         }
        newArray[inserPosition] = insertValue;
        trasverseArray(newArray);
    }

    private static void trasverseArray(int[] newArray) {
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    /*public static int removeElement(final int[] nums, final int val) {
        int resultLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[resultLen] = nums[i];
                resultLen++;
            }
        }
        return resultLen;

    }*/

}
