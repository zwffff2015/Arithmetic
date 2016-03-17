package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Array {
    /*
        输入一个整型数组，数组里有正数也有负数。数组中连续的一个或者多个整数组成一个子数组，每个子数组都有一个和。求所有子数组的和的最大值。要求时间复杂度为O(n)。
     */
    public static int getSum(int[] arr) {
        if (arr == null || arr.length <= 0)
            return 0;

        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum >= 0)
                sum += arr[i];
            else
                sum = arr[i];

            if (sum > max)
                max = sum;
        }
        return max;
    }

    /*
        一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
        注意：
            1.不可从第一个位置开始除，那样第一个元素的值就变成了1了，后面所有元素就会保存不变。
            2.记得判断数组是否为空，以及第一个元素是否为0。
    */
    public static int[] getDivArray(int[] arr) {

        if (arr.length < 0 || arr[0] == 0) {
            System.out.println("数组为空，或者第一个元素为0");
            return null;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }
        return arr;
    }
}
