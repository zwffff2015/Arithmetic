package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Main {
    public static void main(String[] args) {

        // 1. 一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
        int[] result = Array.getDivArray(new int[]{5, 43, 6, 23, 64, 76, 89, 111, 234});
        if (result != null) {
            System.out.print("[1] ");
            for (int i = 0; i < result.length; i++) {
                System.out.printf("%d\t", result[i]);
            }
            System.out.printf("\n");
        }

        // 2.输入两个正整数m和n，求其最大公约数和最小公倍数。
        GcdLcmData gcdLcmData = GcdAndLcm.getByDivision(27, 15);
        System.out.printf("[2.1] GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getBySubtraction(27, 15);
        System.out.printf("[2.2] GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getByLoop(15, 15);
        System.out.printf("[2.3] GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        // 3.输入某年某月某日，判断这一天是这一年的第几天
        int totalDay = Date.getWhichDay(1988, 4, 30);
        System.out.printf("[3] Total day is %1$d\n", totalDay);

        // 4.输入一个整型数组，数组里有正数也有负数。数组中连续的一个或者多个整数组成一个子数组，每个子数组都有一个和。求所有子数组的和的最大值。要求时间复杂度为O(n)。
        int subArraySum = Array.getSum(new int[]{1, -2, 3, 8, -5, 6, 2, -5});
        System.out.println("[4] " + subArraySum);

        // 5.常用排序算法
        // 5.1 交换排序--冒泡排序
        int[] sortArray = Sort.bubbleSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49});
        System.out.print("[5.1] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.2 插入排序--直接插入排序
        sortArray = Sort.insertSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49});
        System.out.print("[5.2] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.3 插入排序--二分插入排序
        sortArray = Sort.halfInsertSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49});
        System.out.print("[5.2] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.4 插入排序--希尔排序
        sortArray = Sort.shellSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4});
        System.out.print("[5.4] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.5 选择排序--简单选择排序
        sortArray = Sort.selectSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4});
        System.out.print("[5.5] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.6 交换排序--快速排序
        sortArray = Sort.quickSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4}, 0, 9);
        System.out.print("[5.6] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.7 归并排序
        sortArray = Sort.mergeSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4}, 0, 9);
        System.out.print("[5.7] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 6. 一个大小为n的数组，里面的数都属于范围[0, n-1]，有不确定的重复元素，找到至少一个重复元素，要求O(1)空间和O(n)时间
        int repeatNumber = GoogleInterview.getOneRepeatNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 1});
        System.out.printf("[6] Repeat number is %1$d\n", repeatNumber);

        // 7. 将一个字符串进行反转，将字符串中指定部分进行反转。
        String reverseStr = StringHelper.reverseString("abcdefg", 2, 5);
        System.out.println("[7] " + reverseStr);
    }
}
