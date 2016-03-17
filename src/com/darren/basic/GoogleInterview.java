package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class GoogleInterview {
    /*
        һ����СΪn�����飬������������ڷ�Χ[0, n-1]���в�ȷ�����ظ�Ԫ�أ��ҵ�����һ���ظ�Ԫ�أ�Ҫ��O(1)�ռ��O(n)ʱ�䡣
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
