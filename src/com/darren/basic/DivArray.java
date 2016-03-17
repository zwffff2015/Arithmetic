package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
/*
    һ�����飬�������ÿ��Ԫ��ȥ����һ��Ԫ�أ��õ�������Ϊ����������λ�õ���ֵ��
    ע�⣺
    1.���ɴӵ�һ��λ�ÿ�ʼ����������һ��Ԫ�ص�ֵ�ͱ����1�ˣ���������Ԫ�ؾͻᱣ�治�䡣
    2.�ǵ��ж������Ƿ�Ϊ�գ��Լ���һ��Ԫ���Ƿ�Ϊ0��
 */
public class DivArray {
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
