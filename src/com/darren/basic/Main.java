package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Main {
    public static void main(String[] args) {

        // 1. һ�����飬�������ÿ��Ԫ��ȥ����һ��Ԫ�أ��õ�������Ϊ����������λ�õ���ֵ��
        int[] result = Array.getDivArray(new int[]{5, 43, 6, 23, 64, 76, 89, 111, 234});
        if (result != null) {
            System.out.print("[1] ");
            for (int i = 0; i < result.length; i++) {
                System.out.printf("%d\t", result[i]);
            }
            System.out.printf("\n");
        }

        // 2.��������������m��n���������Լ������С��������
        GcdLcmData gcdLcmData = GcdAndLcm.getByDivision(27, 15);
        System.out.printf("[2.1] GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getBySubtraction(27, 15);
        System.out.printf("[2.2] GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        gcdLcmData = GcdAndLcm.getByLoop(15, 15);
        System.out.printf("[2.3] GCD=%1$d,LCM=%2$d\n", gcdLcmData.gcd, gcdLcmData.lcm);

        // 3.����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ���
        int totalDay = Date.getWhichDay(1988, 4, 30);
        System.out.printf("[3] Total day is %1$d\n", totalDay);

        // 4.����һ���������飬������������Ҳ�и�����������������һ�����߶���������һ�������飬ÿ�������鶼��һ���͡�������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)��
        int subArraySum = Array.getSum(new int[]{1, -2, 3, 8, -5, 6, 2, -5});
        System.out.println("[4] " + subArraySum);

        // 5.���������㷨
        // 5.1 ��������--ð������
        int[] sortArray = Sort.bubbleSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49});
        System.out.print("[5.1] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.2 ��������--ֱ�Ӳ�������
        sortArray = Sort.insertSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49});
        System.out.print("[5.2] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.3 ��������--���ֲ�������
        sortArray = Sort.halfInsertSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49});
        System.out.print("[5.2] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.4 ��������--ϣ������
        sortArray = Sort.shellSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4});
        System.out.print("[5.4] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.5 ѡ������--��ѡ������
        sortArray = Sort.selectSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4});
        System.out.print("[5.5] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.6 ��������--��������
        sortArray = Sort.quickSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4}, 0, 9);
        System.out.print("[5.6] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 5.7 �鲢����
        sortArray = Sort.mergeSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4}, 0, 9);
        System.out.print("[5.7] ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.printf("%d\t", sortArray[i]);
        }
        System.out.printf("\n");

        // 6. һ����СΪn�����飬������������ڷ�Χ[0, n-1]���в�ȷ�����ظ�Ԫ�أ��ҵ�����һ���ظ�Ԫ�أ�Ҫ��O(1)�ռ��O(n)ʱ��
        int repeatNumber = GoogleInterview.getOneRepeatNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 1});
        System.out.printf("[6] Repeat number is %1$d\n", repeatNumber);

        // 7. ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��
        String reverseStr = StringHelper.reverseString("abcdefg", 2, 5);
        System.out.println("[7] " + reverseStr);
    }
}
