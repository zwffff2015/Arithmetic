package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Main {
    public static void main(String[] args) {

        // 1. һ�����飬�������ÿ��Ԫ��ȥ����һ��Ԫ�أ��õ�������Ϊ����������λ�õ���ֵ��
        int[] result = DivArray.getDivArray(new int[]{5, 43, 6, 23, 64, 76, 89, 111, 234});
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.printf("%d\t", result[i]);
            }
            System.out.printf("\n");
        }

        // 2.��������������m��n���������Լ������С��������
        GcdLcmData gcdLcmData = GcdAndLcm.getByDivision(27, 15);
        System.out.printf("GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getBySubtraction(27, 15);
        System.out.printf("GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getByLoop(15, 15);
        System.out.printf("GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        // 3.����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ���
        int totalDay = Date.getWhichDay(1988, 4, 30);
        System.out.printf("Total day is %1$d", totalDay);
    }
}
