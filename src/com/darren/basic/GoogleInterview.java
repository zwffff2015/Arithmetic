package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class GoogleInterview {
    /*
        一个大小为n的数组，里面的数都属于范围[0, n-1]，有不确定的重复元素，找到至少一个重复元素，要求O(1)空间和O(n)时间。
     */
    public static int getOneRepeatNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] >= arr.length ? arr[i] - arr.length : arr[i];
            if (arr[index] >= arr.length)
                return index;
            else
                arr[index] += arr.length;
        }
        return -1;
    }
}
