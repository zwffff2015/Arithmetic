package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Array {
    /*
        ����һ���������飬������������Ҳ�и�����������������һ�����߶���������һ�������飬ÿ�������鶼��һ���͡�������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)��
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
        һ�����飬�������ÿ��Ԫ��ȥ����һ��Ԫ�أ��õ�������Ϊ����������λ�õ���ֵ��
        ע�⣺
            1.���ɴӵ�һ��λ�ÿ�ʼ����������һ��Ԫ�ص�ֵ�ͱ����1�ˣ���������Ԫ�ؾͻᱣ�治�䡣
            2.�ǵ��ж������Ƿ�Ϊ�գ��Լ���һ��Ԫ���Ƿ�Ϊ0��
    */
    public static int[] getDivArray(int[] arr) {

        if (arr.length < 0 || arr[0] == 0) {
            System.out.println("����Ϊ�գ����ߵ�һ��Ԫ��Ϊ0");
            return null;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }
        return arr;
    }
}
