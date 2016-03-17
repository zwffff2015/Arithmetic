package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
/*
    一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
    注意：
    1.不可从第一个位置开始除，那样第一个元素的值就变成了1了，后面所有元素就会保存不变。
    2.记得判断数组是否为空，以及第一个元素是否为0。
 */
public class DivArray {
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
