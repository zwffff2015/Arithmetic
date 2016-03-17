package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Main {
    public static void main(String[] args) {

        // 1. 一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
        int[] result = DivArray.getDivArray(new int[]{5, 43, 6, 23, 64, 76, 89, 111, 234});
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.printf("%d\t", result[i]);
            }
            System.out.printf("\n");
        }

        // 2.输入两个正整数m和n，求其最大公约数和最小公倍数。
        GcdLcmData gcdLcmData = GcdAndLcm.getByDivision(27, 15);
        System.out.printf("GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getBySubtraction(27, 15);
        System.out.printf("GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getByLoop(15, 15);
        System.out.printf("GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        // 3.输入某年某月某日，判断这一天是这一年的第几天
        int totalDay = Date.getWhichDay(1988, 4, 30);
        System.out.printf("Total day is %1$d", totalDay);
    }
}
